/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.*;
import com.avaje.ebean.Model;

/**
 *
 * @author Humberto
 */
@Entity
public class libro extends Model{
    
    @Id
    public String id;
    
    public String titulo;
    
}
