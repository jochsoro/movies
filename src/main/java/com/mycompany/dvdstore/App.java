package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Quel est le titre du film ?" );
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        System.out.println( "Quel est le genre du film ?" );
        String genre=scanner.nextLine();
        Movie movie=new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        MovieService movieService=new MovieService();
        movieService.registerMovie(movie);
    }
}
