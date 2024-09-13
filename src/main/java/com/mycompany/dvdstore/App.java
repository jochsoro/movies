package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController=new MovieController();
        FileMovieRepository movieRepository=new FileMovieRepository();
        DefaultMovieService defaultMovieService =new DefaultMovieService();
        movieController.setMovieService(defaultMovieService);
        defaultMovieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();
    }
}
