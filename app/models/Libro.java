/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

import java.util.*;


/**
 *
 * @author Humberto
 */
@Entity
public class Libro extends Model{
    @Id
    public int id;
    
    public String titulo;
    public String autor;
    public float precio;
}