package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


    @RunWith(Parameterized.class)
    public class LionParamTest {
        private final String  lionSex;
        private final boolean hasMane;
        protected Feline feline;
        public LionParamTest(String  lionSex, boolean hasMane){
            this.lionSex = lionSex;
            this.hasMane = hasMane;
        }
        @Parameterized.Parameters
        public static Object [][] getLionSex(){
            return new Object[][] {
                    {"Самец",true},
                    {"Самка",false},

            };
        }

        @Test
        public void lionSexTest() throws Exception {
            Lion lion = new Lion(lionSex,feline);
            boolean isMane = lion.doesHaveMane();
            assertEquals(hasMane,isMane);

        }


    }

