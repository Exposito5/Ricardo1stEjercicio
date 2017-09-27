/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqudir;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author acascallarexposito
 */
public class metodos {
    
    File arquivosdir = new File("/home/local/DANIELCASTELAO/acascallarexposito/NetBeansProjects/arquivos/arquivosdir");
    File products1 = new File("/home/local/DANIELCASTELAO/acascallarexposito/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
    File subdir = new File("/home/local/DANIELCASTELAO/acascallarexposito/NetBeansProjects/arquivos/arquivosdir/subdir");
    File products2 = new File("/home/local/DANIELCASTELAO/acascallarexposito/NetBeansProjects/arquivos/arquivosdir/subdir/products2.txt");
    
    
    public void crearDir(){
                
        arquivosdir.mkdirs();
        
        System.out.println("El directorio arquivosdir: "+arquivosdir.exists());
    }
    
    public void crearFich() throws IOException{
        
        products1.createNewFile();
        
        System.out.println("El archivo products1: "+products1.exists());
    }
    
    public void crearDir2(){
        
        subdir.mkdirs();
        
        System.out.println("El directorio subdir: "+subdir.exists());
    }
    
    public void crearFich2() throws IOException{
        
        products2.createNewFile();
        
        System.out.println("El fichero products2: "+products2.exists());
    }
}
