/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ex10;

import java.util.Collections;
import java.util.List;


class Crescente implements Ordenacao<Integer> {
    @Override
    public void ordenar(List<Integer> lista) {
        Collections.sort(lista);
    }
}