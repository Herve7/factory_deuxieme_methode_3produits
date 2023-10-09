/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml2;

/**
 *
 * @author patrick
 */
public abstract class ProduitFactory {
    
    public ProduitA getProduitA(){
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
    
}
