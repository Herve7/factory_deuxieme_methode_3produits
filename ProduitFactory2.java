/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml2;

/**
 *
 * @author patrick
 */
public class ProduitFactory2 extends ProduitFactory{

    
    protected ProduitA createProduitA() {
        return new ProduitA2();
    }
    
}
