public class SpiralHomeWork {
    public static void main(String[] args) {
        //Задаем размеры массива
        int i = 5;
        int j = 7;
        int[][] arr = new int[i][j];
        int stepLimit = i * j;
        //Начальные индексы в массиве
        int iInd = 0;
        int jInd = 0;
        //Инициация лимита шагов
        int iStepsinit = j;
        int jStepsinit = i-1;
        //Инициация счетчиков шагов по осям
        int istep = 0;
        int jstep = 0;
        //Индикаторы направления
        boolean east = true;
        boolean south = false;
        boolean west = false;
        boolean north = false;
        int c = 1;
        //Цикл
        while (c <= stepLimit) {
            while (east == true && iStepsinit != 0) {
                System.out.println("Go to EAST---Steps to do: "+(iStepsinit-istep));
                System.out.println("Cell - [" + iInd + "][" + jInd + "]");
                arr[iInd][jInd] = c;
                c++;
                System.out.println("WRITE - " + arr[iInd][jInd]);
                istep++;
                //Проверка условия нахождения границы движения вправо
                if (istep == iStepsinit) {
                    iStepsinit--;
                    istep = 0;
                    east = false;
                    south = true;
                    break;
                }
                jInd++;
            }
            while (south == true && jStepsinit != 0) {
                System.out.println("Go to SOUTH---Steps to do: "+(jStepsinit-jstep));
                iInd++;
                System.out.println("Cell - [" + iInd + "][" + jInd + "]");
                arr[iInd][jInd] = c;
                c++;
                System.out.println("WRITE - " + arr[iInd][jInd]);
                jstep++;
                //Проверка условия нахождения границы движения вниз
                if (jstep == jStepsinit) {
                    jStepsinit--;
                    jstep = 0;
                    i--;
                    south = false;
                    west = true;
                    break;
                }
            }
            while (west == true && iStepsinit != 0) {
                System.out.println("Go to WEST---Steps to do: "+(iStepsinit-istep));
                jInd--;
                System.out.println("Cell - [" + iInd + "][" + jInd + "]");
                arr[iInd][jInd] = c;
                c++;
                System.out.println("WRITE - " + arr[iInd][jInd]);
                istep++;
                //Проверка условия нахождения границы движения вниз
                if (istep == iStepsinit) {
                    iStepsinit--;
                    istep = 0;
                    west = false;
                    north = true;
                    break;
                }
            }
            while (north == true && jStepsinit != 0) {
                System.out.println("Go to NORTH---Steps to do: "+(jStepsinit-jstep));
                iInd--;
                System.out.println("Cell - [" + iInd + "][" + jInd + "]");
                arr[iInd][jInd] = c;
                c++;
                System.out.println("WRITE - " + arr[iInd][jInd]);
                jstep++;
                //Проверка условия нахождения границы движения вниз
                if (jstep == jStepsinit) {
                    System.out.println("Switch to EAST");
                    jStepsinit--;
                    jstep = 0;
                    jInd++;
                    north = false;
                    east = true;
                    break;
                }
            }
        }
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr[x].length; y++) {
                    System.out.print(arr[x][y] + "\t");
                }
                System.out.println();
            }

    }
}
