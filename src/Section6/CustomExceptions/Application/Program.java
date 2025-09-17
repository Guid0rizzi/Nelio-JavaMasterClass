package Section6.CustomExceptions.Application;

import Section6.CustomExceptions.Model.Entities.DomainException;
import Section6.CustomExceptions.Model.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {

        /*
            Quando eu tiro throws ParseException eu estou falando que
            o metodo main é um metodo normal que não gera exceção nenhuma,
            só que como eu coloquei dentro do meotod uma chamada (sdf.parse) que
            pode lançar uma exceção, o compilador vai reclamar pra mim:
            "olha ou vc trata essa exceção, ou voce propaga ela no metodo que voce esta(main)"
            ou seja quando eu coloco o throws ParseException estou dizendo
            que o meu metodo main pode lançar uma exceção do tipo ParseException.
        *
        * */

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            Integer roomNumer = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date dd/MM/yyyy: ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumer, checkIn, checkOut);
            System.out.println(reservation);
            System.out.print("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date dd/MM/yyyy: ");
            checkOut = sdf.parse(sc.next());
            reservation.updateDates(checkIn, checkOut); // essa função vai voltar um exceção IllegalArgumentException

            System.out.println(reservation);
        }catch (ParseException e){// eu só estou usando esse porque o sdf.parse retorna uma exceção
            System.out.println("invalid date format");
        }catch (DomainException e){ //função updateDates vai retornar exceções e vamos tratar com DomainException que esta no updateDates
            System.out.println("Error in reservation: "+e.getMessage());
        }


        }

    }

//        if(!checkOut.after(checkIn)){
//        System.out.print( "Error in reservation: Check-out date must beaftercheck-in date");
//        }else{

//            if(error != null){
//        System.out.println("Error in reservation: "+ error);
//            }else {
