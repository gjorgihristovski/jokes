package net.gjore.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 08:53
 * Created in net.gjore.jokes.services for jokes
 */
public interface JokeService {

    String getRandomJoke();
}
