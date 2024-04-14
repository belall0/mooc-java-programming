/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abuelela
 */
public class Book {
    private String title;
    private int numOfPages;
    private String publicationDate;
    
    public Book(String title, int numOfPages, String publicationDate){
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationDate = publicationDate;
    }
    
    public String getName(){
        return this.title;
    }
    
    public String toString(){
        return this.title + ", " + this.numOfPages + " pages, " + this.publicationDate;
    }
    
    
    
    
}
