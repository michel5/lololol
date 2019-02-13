package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LolTest {



    @Test
    public void berken(){
        double waardeA = 5;
        double waardeB = 2;
        double waardeVerwacht = 3;
    Lol l = new Lol();

        assertEquals(waardeVerwacht, l.aftrekMethoden(waardeA, waardeB));
    }

    @Test
    public void berkend(){
        double waardeA = 6;
        double waardeB = 2;
        double waardeVerwacht = 3;
        Lol l = new Lol();

        assertEquals(waardeVerwacht, l.aftrekMethoden(waardeA, waardeB));
    }
}