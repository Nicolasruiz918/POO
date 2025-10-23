public class Main {
 public static void main(String[] args) {

    // Computador//
        Computador pc1 = new Computador("Lenovo", 15.6, "Negro");
        pc1.buscar();

        Computador pc2 = new Computador("HP", 14.0, "Gris");
        pc2.buscar();

        Computador pc3 = new Computador("Asus", 16.0, "Blanco");
        pc3.buscar();

        Computador pc4 = new Computador("Acer", 13.3, "Plateado");
        pc4.buscar();

        Computador pc5 = new Computador("Dell", 17.0, "Azul");
        pc5.buscar();

// Televisor//
        Televisor tele1 = new Televisor(1920, 1080, "Negro");
        tele1.mostrar();

        Televisor tele2 = new Televisor(3840, 2160, "Plata");

        tele2.mostrar();


        Televisor tele3 = new Televisor(1280, 720, "Negro");

        tele3.mostrar();

        Televisor tele4 = new Televisor(2560, 1440, "Gris");

        tele4.mostrar();


        Televisor tele5 = new Televisor(4096, 2160, "Azul");

        tele5.mostrar();
    
        //Cargador//

        Cargador cargador1 = new Cargador("Blanco", "Samsung", 1.5, "USB-C");

        cargador1.cargar();


        Cargador cargador2 = new Cargador("Negro", "Apple", 2.0, "Lightning");

        cargador2.cargar();


        Cargador cargador3 = new Cargador("Gris", "Xiaomi", 1.8, "USB-C");

        cargador3.cargar();


        Cargador cargador4 = new Cargador("Rojo", "Sony", 1.2, "Micro-USB");

        cargador4.cargar();


        Cargador cargador5 = new Cargador("Azul", "Lenovo", 2.5, "USB-C");

        cargador5.cargar();

    
        //Teclado//

        Teclado teclado1 = new Teclado("Negro", "Logitech", 45.0);

        teclado1.escribir();


        Teclado teclado2 = new Teclado("Blanco", "Razer", 50.0);

        teclado2.escribir();


        Teclado teclado3 = new Teclado("Gris", "Corsair", 42.5);

        teclado3.escribir();


        Teclado teclado4 = new Teclado("Azul", "Microsoft", 47.0);

        teclado4.escribir();

        Teclado teclado5 = new Teclado("Rojo", "SteelSeries", 48.5);

        teclado5.escribir();
    //Mesa//

        Mesa mesa1 = new Mesa("Marrón", 75.0, 120.0, "Rectangular");
        mesa1.colocar();

        Mesa mesa2 = new Mesa("Blanca", 70.0, 100.0, "Cuadrada");
        mesa2.colocar();

        Mesa mesa3 = new Mesa("Negra", 80.0, 150.0, "Ovalada");
        mesa3.colocar();

        Mesa mesa4 = new Mesa("Gris", 90.0, 200.0, "Rectangular");
        mesa4.colocar();

        Mesa mesa5 = new Mesa("Beige", 65.0, 110.0, "Redonda");
        mesa5.colocar();
    

    //Mouse//


        Mouse mouse1 = new Mouse("Negro", 12.5, "Logitech");
        mouse1.mover();

        Mouse mouse2 = new Mouse("Blanco", 11.0, "HP");
        mouse2.mover();

        Mouse mouse3 = new Mouse("Rojo", 10.8, "Microsoft");
        mouse3.mover();

        Mouse mouse4 = new Mouse("Gris", 13.2, "Razer");
        mouse4.mover();

        Mouse mouse5 = new Mouse("Azul", 12.0, "Genius");
        mouse5.mover();

    //Caja//


        Caja caja1 = new Caja("Roja", 30.0, "CartonBox");
        caja1.guardar();

        Caja caja2 = new Caja("Azul", 25.0, "PlastiSafe");
        caja2.guardar();

        Caja caja3 = new Caja("Verde", 40.5, "EcoPack");
        caja3.guardar();

        Caja caja4 = new Caja("Blanca", 35.0, "BoxPro");
        caja4.guardar();

        Caja caja5 = new Caja("Negra", 28.0, "StrongCase");
        caja5.guardar();
    
        //Silla//


        Silla silla1 = new Silla("Negra", 100.0, "OfficePro", "Ergonómica");
        silla1.sentarse();

        Silla silla2 = new Silla("Blanca", 90.0, "HomeStyle", "Cuadrada");
        silla2.sentarse();

        Silla silla3 = new Silla("Roja", 95.0, "ComfortPlus", "Redonda");
        silla3.sentarse();

        Silla silla4 = new Silla("Gris", 85.0, "DecoLine", "Minimalista");
        silla4.sentarse();

        Silla silla5 = new Silla("Azul", 88.0, "RelaxSeat", "Reclinable");
        silla5.sentarse();
    

        //Lapicero//



        Lapicero lap1 = new Lapicero("Azul", 14.5, "Bic");
        lap1.escribir();

        Lapicero lap2 = new Lapicero("Negro", 15.0, "Pilot");
        lap2.escribir();

        Lapicero lap3 = new Lapicero("Rojo", 14.0, "PaperMate");
        lap3.escribir();

        Lapicero lap4 = new Lapicero("Verde", 13.5, "Faber-Castell");
        lap4.escribir();

        Lapicero lap5 = new Lapicero("Morado", 14.8, "Stabilo");
        lap5.escribir();
    

        //Celular//


        Celular cel1 = new Celular("Samsung", 6.5, "Negro");
        cel1.investigar();

        Celular cel2 = new Celular("Apple", 6.1, "Blanco");
        cel2.investigar();

        Celular cel3 = new Celular("Xiaomi", 6.7, "Azul");
        cel3.investigar();

        Celular cel4 = new Celular("Motorola", 6.4, "Gris");
        cel4.investigar();

        Celular cel5 = new Celular("Huawei", 6.8, "Dorado");
        cel5.investigar();


        //Locker//

        Locker locker1 = new Locker(180.0, "Rectangular", "Gris");
        locker1.guardar();

        Locker locker2 = new Locker(160.0, "Cuadrado", "Azul");
        locker2.guardar();

        Locker locker3 = new Locker(200.0, "Vertical", "Negro");
        locker3.guardar();

        Locker locker4 = new Locker(175.0, "Rectangular", "Rojo");
        locker4.guardar();

        Locker locker5 = new Locker(190.0, "Alto y Delgado", "Verde");
        locker5.guardar();


        //Focos//
        
        Foco foco1 = new Foco("Philips", "Blanco", 12.0);
        foco1.iluminar();

        Foco foco2 = new Foco("Osram", "Amarillo", 10.5);
        foco2.iluminar();

        Foco foco3 = new Foco("GE", "Azul", 11.0);
        foco3.iluminar();

        Foco foco4 = new Foco("Sylvania", "Rojo", 9.8);
        foco4.iluminar();

        Foco foco5 = new Foco("Panasonic", "Verde", 13.0);
        foco5.iluminar();


        //AiereAcondicionado//
        
        AireAcondicionado aire1 = new AireAcondicionado("Samsung", 80.0, 25.0, "Blanco");
        aire1.enfriar();

        AireAcondicionado aire2 = new AireAcondicionado("LG", 75.5, 22.0, "Gris");
        aire2.enfriar();

        AireAcondicionado aire3 = new AireAcondicionado("Daikin", 90.0, 28.0, "Negro");
        aire3.enfriar();

        AireAcondicionado aire4 = new AireAcondicionado("Whirlpool", 85.0, 26.0, "Plateado");
        aire4.enfriar();

        AireAcondicionado aire5 = new AireAcondicionado("Mabe", 70.0, 20.0, "Beige");
        aire5.enfriar();

        //Cartuchera//
        Cartuchera cart1 = new Cartuchera("Totto", "Negra", 20.0);
        cart1.guardar();

        Cartuchera cart2 = new Cartuchera("Samsonite", "Azul", 18.5);
        cart2.guardar();

        Cartuchera cart3 = new Cartuchera("Disney", "Rosa", 22.0);
        cart3.guardar();

        Cartuchera cart4 = new Cartuchera("Nike", "Gris", 19.0);
        cart4.guardar();

        Cartuchera cart5 = new Cartuchera("Puma", "Verde", 21.5);
        cart5.guardar();
    //Cuaderno //
    Cuaderno cua1 = new Cuaderno("Azul", "Norma", 21.0);
        cua1.guardar();

        Cuaderno cua2 = new Cuaderno("Rojo", "Scribe", 22.5);
        cua2.guardar();

        Cuaderno cua3 = new Cuaderno("Verde", "Oxford", 20.0);
        cua3.guardar();

        Cuaderno cua4 = new Cuaderno("Amarillo", "Éxito", 23.0);
        cua4.guardar();

        Cuaderno cua5 = new Cuaderno("Negro", "Stanford", 19.5);
        cua5.guardar();
        
        //Escoba//


        Escoba escoba1 = new Escoba("Roja", "Vileda", 120.0);
        escoba1.barrer();

        Escoba escoba2 = new Escoba("Azul", "Brillogar", 110.0);
        escoba2.barrer();

        Escoba escoba3 = new Escoba("Verde", "CleanHouse", 115.0);
        escoba3.barrer();

        Escoba escoba4 = new Escoba("Amarilla", "SupraClean", 125.0);
        escoba4.barrer();

        Escoba escoba5 = new Escoba("Gris", "PerfectHome", 130.0);
        escoba5.barrer();

        //Recojedor//
        
        Recogedor recogedor1 = new Recogedor("Vileda", "Rojo", 35.0);
        recogedor1.recoger();

        Recogedor recogedor2 = new Recogedor("Brillogar", "Azul", 30.0);
        recogedor2.recoger();

        Recogedor recogedor3 = new Recogedor("CleanMax", "Verde", 32.0);
        recogedor3.recoger();

        Recogedor recogedor4 = new Recogedor("SupraClean", "Amarillo", 33.0);
        recogedor4.recoger();

        Recogedor recogedor5 = new Recogedor("PerfectHome", "Gris", 34.0);
        recogedor5.recoger();
        
        //Puerta//
        Puerta puerta1 = new Puerta(200.0, "Marrón", "Madecor");
        puerta1.cerrar();

        Puerta puerta2 = new Puerta(210.0, "Blanca", "Portex");
        puerta2.cerrar();

        Puerta puerta3 = new Puerta(190.0, "Negra", "SafeDoor");
        puerta3.cerrar();

        Puerta puerta4 = new Puerta(205.0, "Gris", "CasaForte");
        puerta4.cerrar();

        Puerta puerta5 = new Puerta(195.0, "Beige", "DecoHome");
        puerta5.cerrar();
        //Ventana//
                Ventana ventana1 = new Ventana("Blanca", "Cuadrada", "Ventex");
        ventana1.abrir();

        Ventana ventana2 = new Ventana("Marrón", "Rectangular", "CasaView");
        ventana2.abrir();

        Ventana ventana3 = new Ventana("Gris", "Circular", "HomeGlass");
        ventana3.abrir();

        Ventana ventana4 = new Ventana("Negra", "Ovalada", "LuxVent");
        ventana4.abrir();

        Ventana ventana5 = new Ventana("Azul", "Rectangular", "SkyView");
        ventana5.abrir();

    //Bolso //
        Bolso bolso1 = new Bolso("Negro", "Gucci", "Rectangular");
        bolso1.guardar();

        Bolso bolso2 = new Bolso("Rojo", "Prada", "Redondo");
        bolso2.guardar();

        Bolso bolso3 = new Bolso("Azul", "Nike", "Deportivo");
        bolso3.guardar();

        Bolso bolso4 = new Bolso("Beige", "Louis Vuitton", "Cuadrado");
        bolso4.guardar();

        Bolso bolso5 = new Bolso("Gris", "Adidas", "Ovalado");
        bolso5.guardar();
        //Control//
                
        Control control1 = new Control("Negro", "Samsung", 15.0);
        control1.apagar();

        Control control2 = new Control("Blanco", "LG", 14.5);
        control2.apagar();

        Control control3 = new Control("Gris", "Sony", 13.0);
        control3.apagar();

        Control control4 = new Control("Azul", "Panasonic", 16.0);
        control4.apagar();

        Control control5 = new Control("Rojo", "Philips", 12.5);
        control5.apagar();
        //Carpeta//
    
        Carpeta carpeta1 = new Carpeta("Azul", 30.0, "Norma");
        carpeta1.guardar();

        Carpeta carpeta2 = new Carpeta("Roja", 25.5, "Scribe");
        carpeta2.guardar();

        Carpeta carpeta3 = new Carpeta("Verde", 28.0, "OfficeMax");
        carpeta3.guardar();

        Carpeta carpeta4 = new Carpeta("Negra", 35.0, "Kores");
        carpeta4.guardar();

        Carpeta carpeta5 = new Carpeta("Blanca", 27.5, "Econofolder");
        carpeta5.guardar();
    
    // impresora//
        Impresora impresora1 = new Impresora("Blanca", 40.0, "HP");
        impresora1.imprimir();

        Impresora impresora2 = new Impresora("Negra", 35.5, "Canon");
        impresora2.imprimir();

        Impresora impresora3 = new Impresora("Gris", 38.0, "Epson");
        impresora3.imprimir();

        Impresora impresora4 = new Impresora("Azul", 42.0, "Brother");
        impresora4.imprimir();

        Impresora impresora5 = new Impresora("Roja", 37.5, "Samsung");
        impresora5.imprimir();
        //tijeras//
        Tijeras tijera1 = new Tijeras("Recta", "Plateada", "Fiskars");
        tijera1.cortar();

        Tijeras tijera2 = new Tijeras("Curva", "Negra", "Maped");
        tijera2.cortar();

        Tijeras tijera3 = new Tijeras("Pequeña", "Roja", "Stanley");
        tijera3.cortar();

        Tijeras tijera4 = new Tijeras("Grande", "Azul", "Tramontina");
        tijera4.cortar();

        Tijeras tijera5 = new Tijeras("Escolar", "Verde", "Norma");
        tijera5.cortar();
        //regla//
        
        Regla regla1 = new Regla(30.0, "Transparente", "Maped");
        regla1.medir();

        Regla regla2 = new Regla(20.0, "Azul", "Norma");
        regla2.medir();

        Regla regla3 = new Regla(15.0, "Rosa", "Staedtler");
        regla3.medir();

        Regla regla4 = new Regla(50.0, "Verde", "Faber-Castell");
        regla4.medir();

        Regla regla5 = new Regla(25.0, "Amarilla", "Bic");
        regla5.medir();
        //hoja//
        
        Hoja hoja1 = new Hoja("A4", "Blanca", "Bond");
        hoja1.mostrar();

        Hoja hoja2 = new Hoja("Carta", "Amarilla", "Reciclada");
        hoja2.mostrar();

        Hoja hoja3 = new Hoja("Oficio", "Verde", "Opalina");
        hoja3.mostrar();

        Hoja hoja4 = new Hoja("A5", "Rosa", "Decorativa");
        hoja4.mostrar();

        Hoja hoja5 = new Hoja("A3", "Azul", "Fotográfica");
        hoja5.mostrar();
        //block//
        Block block1 = new Block("A4", "Rayado", "Blanco", "Norma");
        block1.mostrar();

        Block block2 = new Block("Carta", "Cuadriculado", "Amarillo", "Scribe");
        block2.mostrar();

        Block block3 = new Block("Oficio", "Liso", "Beige", "Oxford");
        block3.mostrar();

        Block block4 = new Block("A5", "Dibujo", "Blanco", "Artel");
        block4.mostrar();

        Block block5 = new Block("A3", "Espiral", "Celeste", "Econopaper");
        block5.mostrar();
        //audifonos//
        Audifonos audifonos1 = new Audifonos(5.0, "In-Ear", "Negro", "Sony");
        audifonos1.escuchar();

        Audifonos audifonos2 = new Audifonos(6.5, "Over-Ear", "Blanco", "JBL");
        audifonos2.escuchar();

        Audifonos audifonos3 = new Audifonos(4.0, "Inalámbrico", "Rojo", "Apple");
        audifonos3.escuchar();

        Audifonos audifonos4 = new Audifonos(7.0, "Diadema", "Azul", "Logitech");
        audifonos4.escuchar();

        Audifonos audifonos5 = new Audifonos(5.5, "Bluetooth", "Gris", "Samsung");
        audifonos5.escuchar();
        //tomacorriente//
        
        TomaCorriente toma1 = new TomaCorriente(10.0, "Doble", "Blanca", "Rectangular");
        toma1.conectar();

        TomaCorriente toma2 = new TomaCorriente(8.5, "Simple", "Negra", "Cuadrada");
        toma2.conectar();

        TomaCorriente toma3 = new TomaCorriente(12.0, "USB", "Gris", "Circular");
        toma3.conectar();

        TomaCorriente toma4 = new TomaCorriente(9.0, "Industrial", "Roja", "Rectangular");
        toma4.conectar();

        TomaCorriente toma5 = new TomaCorriente(11.5, "Mixta", "Beige", "Ovalada");
        toma5.conectar();
        //tapabocas//
                Tapabocas tapabocas1 = new Tapabocas("Mediano", "Quirúrgico", "Azul");
        tapabocas1.cubrir();

        Tapabocas tapabocas2 = new Tapabocas("Grande", "KN95", "Blanco");
        tapabocas2.cubrir();

        Tapabocas tapabocas3 = new Tapabocas("Pequeño", "Tela", "Negro");
        tapabocas3.cubrir();

        Tapabocas tapabocas4 = new Tapabocas("Mediano", "Deportivo", "Gris");
        tapabocas4.cubrir();

        Tapabocas tapabocas5 = new Tapabocas("Grande", "Reutilizable", "Verde");
        tapabocas5.cubrir();
    }
}
