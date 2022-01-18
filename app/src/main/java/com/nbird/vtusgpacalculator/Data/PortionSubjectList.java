package com.nbird.vtusgpacalculator.Data;

public class PortionSubjectList {
    int sem;
    int branch;
    String[] subjectArr;


    public PortionSubjectList(int sem, int branch) {
        this.sem = sem;
        this.branch = branch;
    }

    public String[] getSubjectArr() {
        dataSetter();
        return subjectArr;
    }

    private void dataSetter() {
        if (sem == 1 || sem == 2) {
            First_Year();
            return;
        }

        switch (branch) {
            case 1: switch (sem) { case 3: Aeronautical_Engineering_III();break; case 4: Aeronautical_Engineering_IV();break; case 5: Aeronautical_Engineering_V();break; case 6: Aeronautical_Engineering_VI();break; case 7: Aeronautical_Engineering_VII();break; case 8: Aeronautical_Engineering_VIII();break; }break;
            case 2: switch (sem) { case 3: Aerospace_Engineering_III();break; case 4: Aerospace_Engineering_IV();break; case 5: Aerospace_Engineering_V();break; case 6: Aerospace_Engineering_VI();break; case 7: Aerospace_Engineering_VII();break; case 8: Aerospace_Engineering_VIII();break; }break;
            case 3: switch (sem) { case 3: Architecture_III();break; case 4: Architecture_IV();break; case 5: Architecture_V();break; case 6: Architecture_VI();break; case 7: Architecture_VII();break; case 8: Architecture_VIII();break; }break;
            case 4: switch (sem) { case 3: Biomedical_Engineering_III();break; case 4: Biomedical_Engineering_IV();break; case 5: Biomedical_Engineering_V();break; case 6: Biomedical_Engineering_VI();break; case 7: Biomedical_Engineering_VII();break; case 8: Biomedical_Engineering_VIII();break; }break;
            case 5: switch (sem) { case 3: Biotechnology_III();break; case 4: Biotechnology_IV();break; case 5: Biotechnology_V();break; case 6: Biotechnology_VI();break; case 7: Biotechnology_VII();break; case 8: Biotechnology_VIII();break; }break;
            case 6: switch (sem) { case 3: Chemical_Engineering_III();break; case 4: Chemical_Engineering_IV();break; case 5: Chemical_Engineering_V();break; case 6: Chemical_Engineering_VI();break; case 7: Chemical_Engineering_VII();break; case 8: Chemical_Engineering_VIII();break; }break;
            case 7: switch (sem) { case 3: Civil_Engineering_III();break; case 4: Civil_Engineering_IV();break; case 5: Civil_Engineering_V();break; case 6: Civil_Engineering_VI();break; case 7: Civil_Engineering_VII();break; case 8: Civil_Engineering_VIII();break; }break;
            case 8: switch (sem) { case 3: Computer_Science_Engineering_III();break; case 4: Computer_Science_Engineering_IV();break; case 5: Computer_Science_Engineering_V();break; case 6: Computer_Science_Engineering_VI();break; case 7: Computer_Science_Engineering_VII();break; case 8: Computer_Science_Engineering_VIII();break; }break;
            case 9: switch (sem) { case 3: Electrical_Electronics_Engineering_III();break; case 4: Electrical_Electronics_Engineering_IV();break; case 5: Electrical_Electronics_Engineering_V();break; case 6: Electrical_Electronics_Engineering_VI();break; case 7: Electrical_Electronics_Engineering_VII();break; case 8: Electrical_Electronics_Engineering_VIII();break; }break;
            case 10: switch (sem) { case 3: Electronics_Communication_Engineering_III();break; case 4: Electronics_Communication_Engineering_IV();break; case 5: Electronics_Communication_Engineering_V();break; case 6: Electronics_Communication_Engineering_VI();break; case 7: Electronics_Communication_Engineering_VII();break; case 8: Electronics_Communication_Engineering_VIII();break; }break;
            case 11: switch (sem) { case 3: Electronics_Instrumentation_Engineering_III();break; case 4: Electronics_Instrumentation_Engineering_IV();break; case 5: Electronics_Instrumentation_Engineering_V();break; case 6: Electronics_Instrumentation_Engineering_VI();break; case 7: Electronics_Instrumentation_Engineering_VII();break; case 8: Electronics_Instrumentation_Engineering_VIII();break; }break;
            case 12: switch (sem) { case 3: Electronics_Telecommunication_Engineering_III();break; case 4: Electronics_Telecommunication_Engineering_IV();break; case 5: Electronics_Telecommunication_Engineering_V();break; case 6: Electronics_Telecommunication_Engineering_VI();break; case 7: Electronics_Telecommunication_Engineering_VII();break; case 8: Electronics_Telecommunication_Engineering_VIII();break; }break;
            case 13: switch (sem) { case 3: Industrial_Production_Engineering_III();break; case 4: Industrial_Production_Engineering_IV();break; case 5: Industrial_Production_Engineering_V();break; case 6: Industrial_Production_Engineering_VI();break; case 7: Industrial_Production_Engineering_VII();break; case 8: Industrial_Production_Engineering_VIII();break; }break;
            case 14: switch (sem) { case 3: Industrial_Engineering_Management_III();break; case 4: Industrial_Engineering_Management_IV();break; case 5: Industrial_Engineering_Management_V();break; case 6: Industrial_Engineering_Management_VI();break; case 7: Industrial_Engineering_Management_VII();break; case 8: Industrial_Engineering_Management_VIII();break; }break;
            case 15: switch (sem) { case 3: Information_Science_Engineering_III();break; case 4: Information_Science_Engineering_IV();break; case 5: Information_Science_Engineering_V();break; case 6: Information_Science_Engineering_VI();break; case 7: Information_Science_Engineering_VII();break; case 8: Information_Science_Engineering_VIII();break; }break;
            case 16: switch (sem) { case 3: Manufacturing_Science_Engineering_III();break; case 4: Manufacturing_Science_Engineering_IV();break; case 5: Manufacturing_Science_Engineering_V();break; case 6: Manufacturing_Science_Engineering_VI();break; case 7: Manufacturing_Science_Engineering_VII();break; case 8: Manufacturing_Science_Engineering_VIII();break; }break;
            case 17: switch (sem) { case 3: Marine_Engineering_III();break; case 4: Marine_Engineering_IV();break; case 5: Marine_Engineering_V();break; case 6: Marine_Engineering_VI();break; case 7: Marine_Engineering_VII();break; case 8: Marine_Engineering_VIII();break; }break;
            case 18: switch (sem) { case 3: Mechanical_Engineering_III();break; case 4: Mechanical_Engineering_IV();break; case 5: Mechanical_Engineering_V();break; case 6: Mechanical_Engineering_VI();break; case 7: Mechanical_Engineering_VII();break; case 8: Mechanical_Engineering_VIII();break; }break;
            case 19: switch (sem) { case 3: Mechatronics_III();break; case 4: Mechatronics_IV();break; case 5: Mechatronics_V();break; case 6: Mechatronics_VI();break; case 7: Mechatronics_VII();break; case 8: Mechatronics_VIII();break; }break;
            case 20: switch (sem) { case 3: Medical_Electronics_III();break; case 4: Medical_Electronics_IV();break; case 5: Medical_Electronics_V();break; case 6: Medical_Electronics_VI();break; case 7: Medical_Electronics_VII();break; case 8: Medical_Electronics_VIII();break; }break;
            case 21: switch (sem) { case 3:  Mining_Engineering_III();break; case 4:  Mining_Engineering_IV();break; case 5:  Mining_Engineering_V();break; case 6:  Mining_Engineering_VI();break; case 7:  Mining_Engineering_VII();break; case 8:  Mining_Engineering_VIII();break; }break;
            case 22: switch (sem) { case 3: Nano_Technology_III();break; case 4: Nano_Technology_IV();break; case 5: Nano_Technology_V();break; case 6: Nano_Technology_VI();break; case 7: Nano_Technology_VII();break; case 8: Nano_Technology_VIII();break; }break;
            case 23: switch (sem) { case 3: Petrochem_Engineering_III();break; case 4: Petrochem_Engineering_IV();break; case 5: Petrochem_Engineering_V();break; case 6: Petrochem_Engineering_VI();break; case 7: Petrochem_Engineering_VII();break; case 8: Petrochem_Engineering_VIII();break; }break;
        }
    }
        
       
        
           
        
        

    

    private void First_Year(){
        subjectArr= new String[]{"Advance Calculus And Numerical Methods", "Basic Electrical Engineering","Basic Electrical Lab","Basic Electronics","C Programming For Problem Solving",
        "C Programming Lab","Calculus And Linear Algebra","Elements Of Civil Engineering And Mechanics","Elements Of Mechanical Engineering","Engineering Chemistry Lab","Engineering Chemistry",
        "Engineering Graphics","Engineering Physics Lab","Engineering Physics","Technical English I","Technical English II"};
    }
    

    private void Aeronautical_Engineering_III(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada","Aero Thermodynamics","CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)","Elements of Aeronautics",
                "MACHINE SHOP LAB","MATERIAL TESTING LAB","MEASUREMENTS AND METROLOGY LAB","Measurement and Metrology","Mechanics of Fluids","Mechanics of Materials",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES","Vyavaharika Kannada"};

    }

    private void Aeronautical_Engineering_IV(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – II","Aerodynamics-I","Aircraft Material Science",
        "Aircraft Propulsion","COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS","COMPUTER AIDED AIRCRAFT DRAWING",
        "MATERIAL TESTING LAB","MEASUREMENTS AND METROLOGY LAB","Mechanisms and Machine Theory","Turbomachines"};
    }

    private void Aeronautical_Engineering_V(){
        subjectArr= new String[]{"AERODYNAMICS - II","AERODYNAMICS LAB","AIRCRAFT STRUCTURES - I",
                "AIRCRAFT SYSTEMS & INSTRUMENTATION","ENERGY CONVERSION AND FLUID MECHANICS LAB",
        "ENVIRONMENTAL STUDIES","INTRODUCTION TO COMPOSITE MATERIALS","MANAGEMENT AND ENTREPRENEURSHIP",
        "THEORY OF VIBRATIONS"};
    }

    private void Aeronautical_Engineering_VI(){
        subjectArr= new String[]{"AIRCRAFT PERFORMANCE","AIRCRAFT PROPULSION LAB","AIRCRAFT STRUCTURES - II",
        "AIRCRAFT STRUCTURES LAB","AIRCRAFT TRANSPORTATION SYSTEMS","ARTIFICIAL INTELLIGENCE& EXPERT SYSTEMS",
        "BASICS OF ROCKETS & MISSILES","ELEMENTS OF JET PROPULSION SYSTEMS","FINITE ELEMENT METHOD",
        "GAS TURBINE TECHNOLOGY","HISTORY OF FLIGHT & TECHNOLOGY FORECAST","NUMERICAL METHODS"};
    }

    private void Aeronautical_Engineering_VII(){
        subjectArr= new String[]{"AIRCRAFT STABILITY AND CONTROL","COMPUTATIONAL FLUID DYNAMICS","CONTROL ENGINEERING",
        "FATIGUE AND FRACTURE MECHANICS","FLIGHT SIMULATION LAB","FUNDAMENTALS OF AERODYNAMIC THEORY","GUIDANCE, NAVIGATION & CONTROL",
        "HEAT & MASS TRANSFER","HIGH PERFORMANCE COMPUNTING","HYDRAULICS & PNEUMATICS","MAINTENANCE, OVERHAUL & REPAIR OF AIRCRAFT SYSTEMS",
        "MODELING & ANALYSIS LAB","OPERATIONS RESEARCH","UNMANNED AERIAL VEHICLES","WIND TUNNEL TECHNIQUES"};
    }

    private void Aeronautical_Engineering_VIII(){
        subjectArr= new String[]{"A VIONICS","BOUNDARY LAYER THEORY","FLIGHT TESTING","FLIGHT VEHICLE DESIGN",
        "HELICOPTER DYNAMICS"};
    }

    

    

    private void Aerospace_Engineering_III(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – I","AEROSPACE MATERIALS","Aadalitha Kannada","Aero Thermodynamics",
        "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)","INTRODUCTION TO AEROSPACE ENGINEERING",
        "MATERIAL TESTING LAB","MEASUREMENTS AND METROLOGY LAB","Mechanics of Fluids","Mechanics of Materials",
        "SATELLITE COMMUNICATION","TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES","Vyavaharika Kannada"};
    }

    private void Aerospace_Engineering_IV(){
        subjectArr= new String[]{"AEROSPACE STRUCTURES – I","Aerodynamics-I","COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
        "COMPOSITE MATERIALS","COMPUTER AIDED AIRCRAFT DRAWING","ENERGY CONVERSION AND FLUID MECHANICS LAB","INTRODUCTION TO SPACE TECHNOLOGY",
        "Mechanisms and Machine Theory"};
    }

    private void Aerospace_Engineering_V(){
        subjectArr= new String[]{"AERODYNAMICS - II","AERODYNAMICS LAB","AEROSPACE PROPULSION","AEROSPACE STRUCTURES - II",
        "AIRCRAFT SYSTEMS & INSTRUMENTATION","ENVIRONMENTAL STUDIES SECONDARY","ENVIRONMENTAL STUDIES","FLIGHT MECHANICS",
        "MANAGEMENT AND ENTREPRENEURSHIP","PROPULSION LAB"};
    }

    private void Aerospace_Engineering_VI(){
        subjectArr= new String[]{"AIRCRAFT STRUCTURES LAB","BASICS OF ROCKETS & MISSILES","COMPUTATIONAL FLUID DYNAMICS",
        "DESIGN, MODELLING & ANALYSIS LAB","ELEMENTS OF JET PROPULSION SYSTEMS","FINITE ELEMENT METHOD","HISTORY OF FLIGHT & TECHNOLOGY FORECAST",
        "HYPERSONICS","INTRODUCTION TO ASTROPHYSICS AND SPACE ENVIRONMENT","MISSILES AND LAUNCH VEHICLES","RADAR AND MICROWAVE ENGINEERING","THEORY OF VIBRATIONS"};
    }

    private void Aerospace_Engineering_VII(){
        subjectArr= new String[]{"AVIONICS AND INSTRUMENTATION LAB","AVIONICS SYSTEMS","Air And Missile Defence Systems",
        "CONTROL ENGINEERING","FUNDAMENTALS OF AERODYNAMIC THEORY","GLOBAL NAVIGATION SATELLITE SYSTEMS","GUIDANCE, NAVIGATION & CONTROL",
        "HEAT & MASS TRANSFER","MAINTENANCE, OVERHAUL & REPAIR OF AIRCRAFT SYSTEMS","SPACE MECHANICS","SPACE SIMULATION LAB",
        "SPACE VEHICLE DESIGN","UNMANNED AERIAL VEHICLES","WIND TUNNEL TECHNIQUES"};
    }

    private void Aerospace_Engineering_VIII(){
        subjectArr= new String[]{"CRYOGENICS","OPTIMIZATION TECHNIQUES","ROBOTICS","SATELLITE NAVIGATION SYSTEMS","SPACECRAFT SYSTEMS"};
    }



    private void Architecture_I(){
        subjectArr= new String[]{"ARCHITECTURAL DESIGN -I","ARCHITECTURAL GRAPHICS-I","BASIC DESIGN & VISUAL ARTS",
        "BUILDING STRUCTURES-I","COMMUNICATION SKILLS","HISTORY OF ARCHITECTURE - I","MATERIALS AND METHODS IN BUILDING CONSTRUCTION-I",
        "MODEL MAKING WORKSHOP"};
    }

    private void Architecture_II(){
        subjectArr= new String[]{"ARCHITECTURAL DESIGN -II","ARCHITECTURAL GRAPHICS-II","BASIC DESIGN & ART APPRECIATION",
        "BUILDING STRUCTURES-II","HISTORY OF ARCHITECTURE - II","KANNADA BHASHE - Aadalitha Matthu Vyavahara","MATERIALS AND METHODS IN BUILDING CONSTRUCTION-II",
        "SITE SURVEYING & ANALYSIS","Vyavaharika Kannada"};
    }

    private void Architecture_III(){
        subjectArr= new String[]{"ARCHITECTURAL DESIGN-III","BUILDING STRUCTURES – III","CLIMATOLOGY","COMPUTER APPLICATIONS IN ARCHITECTURE -I",
        "ELECTIVE","HISTORY OF ARCHITECTURE – III","MATERIALS AND METHODS IN BUILDING CONSTRUCTION-III","THEORY OF ARCHITECTURE-I"};
    }

    private void Architecture_IV(){
        subjectArr= new String[]{"ARCHITECTURAL DESIGN - IV","BUILDING SERVICES – I (Water Supply and Sanitation)","BUILDING STRUCTURES – IV",
        "COMPUTER APPLICATIONS IN ARCHITECTURE – II","ELECTIVE II","HISTORY OF ARCHITECTURE-IV","MATERIALS AND METHODS IN BUILDING CONSTRUCTION-IV",
        "THEORY OF ARCHITECTURE -II"};
    }

    private void Architecture_V(){
        subjectArr= new String[]{"ARCHITECTURAL DESIGN -V","BUILDING SERVICES-II (Electrical Services and Illumination)","BUILDING STRUCTURES - V",
        "ELECTIVE -V","ELECTIVE III","HISTORY OF ARCHITECTURE - V","MATERIALS AND METHODS IN BUILDING CONSTRUCTION – V",
        "SOCIOLOGY AND BUILDING ECONOMICS","WORKING DRAWING -I"};
    }

    private void Architecture_VI(){
        subjectArr= new String[]{"ARCHITECTURAL DESIGN - VI","BUILDING SERVICES - III","BUILDING STRUCTURES - VI",
        "CONTEMPORARY ARCHITECTURE","ELECTIVE I","LANDSCAPE ARCHITECTURE","MATERIALS AND METHODS IN BUILDING CONSTRUCTION–VI",
        "STUDY TOUR","WORKING DRAWING II"};
    }

    private void Architecture_VII(){
        subjectArr= new String[]{"ARCHITECTURAL DESIGN - VII","BUILDING SERVICES – IV(ACOUSTICS AND NOISE CONTROL)",
        "INTERIOR DESIGN","MATERIALS AND METHODS IN BUILDING CONSTRUCTION VII","SPECIFICATION, QUANTITY AND COSTING OF BUILDINGS",
        "URBAN DESIGN"};
    }

    private void Architecture_VIII(){
        subjectArr= new String[]{"PROFESSIONAL TRAINING","ARCHITECTURAL DESIGN - VIII (ARCHITECTURE IN URBAN CONTEXT)",
        "ARCHITECTURAL DESIGN PROJECT(Thesis)","CONSTITUTIONAL LAW","CONSTRUCTION AND PROJECT MANAGEMENT","ELECTIVE -VI",
        "MATERIALS AND METHODS IN BUILDING CONSTRUCTION VIII","PROFESSIONAL PRACTICE","PROFESSIONAL TRAINING","THESIS SEMINAR",
        "URBAN PLANNING"};
    }
    


    private void Biomedical_Engineering_III(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – I","Aadalitha Kannada","Analog Electronic Circuits Lab",
        "Analog Electronic Circuits","CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)","Digital Design and HDL Lab",
        "Digital Design and HDL","Electronic Instrumentation and Measurements","Human Anatomy and Physiology",
        "Network Analysis","TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES","Vyavaharika Kannada"};
    }

    private void Biomedical_Engineering_IV(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – II","Biomedical Transducers and Instrumentation","Biomedical Transducers and Measurements Lab",
        "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS","Control Systems","Embedded Controllers Lab","Embedded Controllers",
        "Scientific and Analytical Instrumentation","Signal Conditioning and Data Acquisition Circuits"};
    }

    private void Biomedical_Engineering_V(){
        subjectArr= new String[]{"Biomedical Equipment","Clinical Instrumentation and Signal Processing Lab","Clinical Instrumentation",
        "ENVIRONMENTAL STUDIES","Fundamentals of Signals and DSP","Rehabilitation Engineering","Signal Conditioning Circuits and Data Acquisition Lab",
        "Technological Innovation Management and Entrepreneurship","VLSI Design"};
    }

    private void Biomedical_Engineering_VI(){
        subjectArr= new String[]{"Advanced Clinical Instrumentation","Analog and Digital Communication Systems",
        "Biomedical Transducers and Instrumentation","Hospital Design, Planning and Management",
        "Internship","JAVA Programming Lab","JAVA Programming","Medical Device Regulations and Safety",
        "Medical Image Processing Lab","Medical Image Processing","Medical Imaging Systems","Mini Project",
                "Rehabilitation Engineering","Virtual Bio-Instrumentation"};
    }

    private void Biomedical_Engineering_VII(){
        subjectArr= new String[]{"ARM Processor Lab","ARM Processor","Biomechanics and Biodynamics","Biomedical DSP Lab",
        "Biomedical Digital Signal Processing","Biomedical Digital Signal Processing","Biometric Systems",
        "Biostatistics","Database Management System in Healthcare","Ergonomics","Internet of Things","Internship",
        "Lasers and Optical Fibers in Medicine","Medical Image Processing","Medical Informatics and Expert Systems Secondary",
        "Medical Informatics and Expert Systems","Project Work Phase-1"};
    }

    private void Biomedical_Engineering_VIII(){
        subjectArr= new String[]{"Artificial Intelligence and Machine Learning","Bio-MEMS","Biomaterials and Artificial Organs",
        "Computer Communication Networks in Healthcare","Internship","Medical Imaging Systems","Project Work Phase-2",
        "Technical Seminar"};
    }
    

    private void Biotechnology_III(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – I","Aadalitha Kannada","BIOSTATISTICS","CELL BIOLOGY AND GENETICS",
        "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)","INTRODUCTION TO BIOMOLECULES","MICROBIOLOGY LABORATORY",
        "MICROBIOLOGY","PYTHON PROGRAMMING","UNIT OPERATIONS LABORATORY","UNIT OPERATIONS","Vyavaharika Kannada"};
    }

    private void Biotechnology_IV(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – II","BIOCHEMICAL THERMODYNAMICS","BIOCHEMISTRY LABORATORY",
        "CELL CULTURE TECHNIQUES","CLINICAL BIOCHEMISTRY","IMMUNOTECHNOLOGY LABORATORY","IMMUNOTECHNOLOGY","MOLECULAR BIOLOGY",
        "STOICHIOMETRY"};
    }

    private void Biotechnology_V(){
        subjectArr= new String[]{"BIO-BUSINESS AND ENTREPRENEURSHIP","BIOANALYTICAL TECHNIQUES","BIOKINETICS& ENZYME TECHNOLOGY LABORATORY",
        "CHEMICAL REACTION ENGINEERING","ENVIRONMENTAL STUDIES","ENZYME TECHNOLOGY & BIOTRANSFORMATION","GENETIC ENGINEERING & APPLICATIONS",
        "GENETIC ENGINEERING AND CELL CULTURE LABORATORY","GENOMICS AND PROTEOMICS"};
    }

    private void Biotechnology_VI(){
        subjectArr= new String[]{"BIOINFORMA TICS","BIOINFORMATICS LABORATORY","BIOLOGY FOR ENGINEERS","BIOMA TERIALS",
        "BIOPROCESS EQUIPMENT DESIGN & CAED","BIOTECHNOLOGY","FOOD PROCESS ENGINEERING","HUMAN PHYSIOLOGY","NANOBIOTECHNOLOGY",
        "PHYTO-CHEMISTRY AND PHYTO-HARMONES","PROCESS CONTROL & AUTOMATION LABORATORY","PROCESS CONTROL & AUTOMATION"};
    }

    private void Biotechnology_VII(){
        subjectArr= new String[]{"AGRICULTURAL BIOTECHNOLOGY","BIOETHICS , BIOSAFETY & IPR","BIOLOGICAL DATA MANAGEMENT",
        "BIOPROCESS ENGINEERING LABORATORY","BIOPROCESS ENGINEERING","BIOREACTOR DESIGN CONCEPTS","BT FOR SUSTAINABLE ENVIRONMENT",
        "CLINICAL & PHARMACEUTICAL BIOTECHNOLOGY","FORENSIC SCIENCE","PROCESS EQUIPMENT& PLANT DESIGN","TISSUE ENGINEERING",
        "TRANSPORT PHENOMENA"};
    }

    private void Biotechnology_VIII(){
        subjectArr= new String[]{"ENVIRONMENTAL BIOTECHNOLOGY","INDUSTRIAL MICROBIOLOGY","MARINE BIOTECHNOLOGY","REGULATORY AFFAIRS IN BIOTECH INDUSTRY"};
    }
    

    private void Chemical_Engineering_III(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – I","Aadalitha Kannada","CHEMICAL PROCESS CALCULATIONS","CHEMICAL TECHNOLOGY-I",
        "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)","MECHANICAL OPERATIONS","MOMENTUM TRANSFER LAB",
        "MOMENTUM TRANSFER","TECHNICAL CHEMISTRY LAB","TECHNICAL CHEMISTRY","TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
        "Vyavaharika Kannada"};
    }

    private void Chemical_Engineering_IV(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – II","CHEMICAL ENGINEERING DRAWING LAB","CHEMICAL ENGINEERING THERMODYNAMICS",
        "CHEMICAL TECHNOLOGY-II","COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS","INSTRUMENTAL ANALYSIS","MATERIAL SCIENCE",
        "MECHANICAL OPEARATIONS LAB","PROCESS HEAT TRANSFER"};
    }

    private void Chemical_Engineering_V(){
        subjectArr= new String[]{"BIOCHEMICAL ENGINEERING","CHEMICAL EQUIPMENT DESIGN","CHEMICAL REACTION ENGINEERING-I",
        "ENVIRONMENTAL STUDIES","HEAT TRANSFER LAB","INDUSTRIAL POLLUTION CONTROL","MANAGEMENT AND ENTREPRENEURSHIP",
        "MASS TRANSFER OPERATIONS-I","POLLUTION CONTROL & INSTRUMENTAL ANALYSIS LAB"};
    }

    private void Chemical_Engineering_VI(){
        subjectArr= new String[]{"CHEMICAL PLANT UTILITIES AND SAFETY","CHEMICAL REACTION ENGINEERING LAB","CHEMICAL REACTION ENGINEERING-II",
        "MASS TRANSFER OPERATIONS LAB","MASS TRANSFER OPERATIONS-II SECONDARY","MASS TRANSFER OPERATIONS-II","MINI-PROJECT",
        "OILS AND FATS TECHNOLOGY","PETROLEUM REFINERY ENGINEERING","PROCESS AIR POLLUTION & CONTROL","PROCESS EQUIPMENT DESIGN AND DRAWING",
        "PROCESS WASTE WATER MANAGEMENT","SOLID WASTE MANAGEMENT IN PROCESS INDUSTRIES"};
    }

    private void Chemical_Engineering_VII(){
        subjectArr= new String[]{"CHEMICAL PROCESS INTEGRATION","COMPUTER APPLICATIONS & SIMULATION LAB","COMPUTER APPLICATIONS AND MODELING",
        "ELECTRO CHEMICAL TECHNOLOGY","FERMENTATION TECHNOLOGY","FOOD TECHNOLOGY","INTERNSHIP","NOVEL SEPARATION TECHNIQUES",
        "PETROCHEMICAL ENGINEERING","PETROCHEMICALS","PILOT PLANT AND SCALE UP STUDIES","PROCESS CONTROL AND INSTRUMENTATION",
        "PROCESS CONTROL LAB","PROJECT WORK PHASE-1","PULP AND PAPER TECHNOLOGY"};
    }

    private void Chemical_Engineering_VIII(){
        subjectArr= new String[]{"APPLIED MATHEMATICS IN CHEMICAL ENGINEERING SECONDARY","APPLIED MATHEMATICS IN CHEMICAL ENGINEERING",
        "PROCESS ENGINEERING ECONOMICS AND MANAGEMENT SECONDARY","PROCESS ENGINEERING ECONOMICS AND MANAGEMENT",
        "PROJECT WORK PHASE-2","TECHNICAL SEMINAR INTERNSHIP"};
    }
    

    private void Civil_Engineering_III(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – I","Aadalitha Kannada","BASIC SURVEYING","BUILDING MATERIALS AND CONSTRUCTION",
        "BUILDING MATERIALS TESTING LABORATORY","CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
        "ENGINEERING GEOLOGY","FLUIDS MECHANICS","STRENGTH OF MATERIALS","TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
        "Vyavaharika Kannada"};
    }

    private void Civil_Engineering_IV(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – II","ADVANCED SURVEYING","ANALYSIS OF DETERMINATE STRUCTURES",
        "APPLIED HYDRAULICS","COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS","CONCRETE TECHNOLOGY",
        "ENGINEERING GEOLOGY LABORATORY","FLUID MECHANICS AND HYDRAULIC MACHINES LABORATORY","WATER SUPPLY AND TREATMENT ENGINEERING"};
    }

    private void Civil_Engineering_V(){
        subjectArr= new String[]{"ANALYSIS OF INDETERMINATE STRUCTURES","BASIC GEOTECHNICAL ENGINEERING","COMPUTER AIDED BUILDING PLANNING AND DRAWING",
        "CONCRETE AND HIGHWAY MATERIALS LABORATORY","CONSTRUCTION MANAGEMENT AND ENTREPRENEURSHIP","DESIGN OF RC STRUCTURAL ELEMENTS",
        "ENVIRONMENTAL STUDIES","HIGHWAY ENGINEERING","MUNICIPAL WASTEWATER ENGINEERING","SURVEYING PRACTICE"};
    }

    private void Civil_Engineering_VI(){
        subjectArr= new String[]{"ALTERNATE BUILDING MATERIALS","APPLIED GEOTECHNICAL ENGINEERING","DESIGN OF STEEL STRUCTURAL ELEMENTS",
        "ENVIRONMENTAL ENGINEERING LABORATORY","EXTENSIVE SURVEY PROJECT","GROUND IMPROVEMENT TECHNIQUES","HYDROLOGY AND IRRIGATION ENGINEERING",
        "MATRIX METHOD OF STRUCTURAL ANALYSIS","OCCUPATIONAL HEALTH AND SAFETY","RAILWAYS, HARBOUR, TUNNELING AND AIRPORTS",
        "REMOTE SENSING AND GIS","SOFTWARE APPLICATION LABORATORY","SOLID WASTE MANAGEMENT","SUSTAINABILITY CONCEPTS IN CIVIL ENGINEERING",
        "TRAFFIC ENGINEERING"};
    }

    private void Civil_Engineering_VII(){
        subjectArr= new String[]{"AIR POLLUTION AND CONTROL","COMPUTER AIDED DETAILING OF STRUCTURES","DESIGN CONCEPT OF BUILDING SERVICES",
        "DESIGN OF HYDRAULIC STRUCTURES","DESIGN OF RCC AND STEEL STRUCTURES","EARTHQUAKE ENGINEERING","ENVIRONMENTAL PROTECTION AND MANAGEMENT",
        "FINITE ELEMENT METHOD","GEOTECHNICAL ENGINEERING LABORATORY","GROUND WATER HYDRAULICS","MASONRY STRUCTURES","NUMERICAL METHODS AND APPLICATIONS",
        "PAVEMENT MATERIALS AND CONSTRUCTION","QUANTITY SURVEYING AND CONTRACT MANAGEMENT","REINFORCED EARTH STRUCTURES","THEORY OF ELASTICITY",
        "URBAN TRANSPORT PLANNING"};
    }

    private void Civil_Engineering_VIII(){
        subjectArr= new String[]{"ADVANCED FOUNDATION ENGINEERING","BRIDGE ENGINEERING","DESIGN OF PRE-STRESSECONCRETE",
        "INTERNSHIP PROFESSIONAL PRACTICE","PAVEMENT DESIGN","PREFABRICATED STRUCTURES","PROJECT WORK PHASE-2",
                "REHABILITATION AND RETROFITTING","TECHNICAL SEMINAR"};
    }
    

    private void Computer_Science_Engineering_III(){
        subjectArr= new String[]{"ANALOG AND DIGITAL ELECTRONICS LABORATORY","ANALOG AND DIGITAL ELECTRONICS",
        "COMPUTER ORGANIZATION","DATA STRUCTURES AND APPLICATION","DATA STRUCTURES LABORATORY",
        "DISCRETE MATHEMATICAL STRUCTURES","SOFTWARE ENGINEERING"};
    }

    private void Computer_Science_Engineering_IV(){
        subjectArr= new String[]{"DATA COMMUNICATION","DESIGN AND ANALYSIS OF ALGORITHMS LABORATORY",
        "DESIGN AND ANALYSIS OF ALGORITHMS","MICROCONTROLLER AND EMBEDDED SYSTEMS LABORATORY",
        "MICROCONTROLLER AND EMBEDDED SYSTEMS","OBJECT ORIENTED CONCEPTS","OPERATING SYSTEMS"};
    }

    private void Computer_Science_Engineering_V(){
        subjectArr= new String[]{"AUTOMATA THEORY AND COMPUTABILITY","COMPUTER NETWORK LABORATORY",
        "COMPUTER NETWORKS","DATABASE MANAGEMENT SYSTEM","DBMS LABORATORY WITH MINI PROJECT",
        "MANAGEMENT AND ENTREPRENEURSHIP FOR IT INDUSTRY","RAPID APPLICATION DEVELOPMENT USING PYTHON",
        "UNIX PROGRAMMING"};
    }

    private void Computer_Science_Engineering_VI(){
        subjectArr= new String[]{"CLOUD COMPUTING AND ITS APPLICATIONS","COMPUTER GRAPHICS LABORATORY WITH MINI PROJECT",
        "COMUTER GRAPHICS AND VISUALIZATION","CRYPTOGRAPHY, NETWORK SECURITY AND CYBERLAW","DATA MINING AND DATA WAREHOUSING",
        "INTRODUCTION TO DATA SRUCTURES AND ALGORITHMS","MOBILE APPLICATION DEVELOPMENT (OPEN ELECTIVE)","MOBILE APPLICATION DEVELOPMENT",
        "OBJECT ORIENTED MODELING AND DESIGN","PYTHON APPLICATION PROGRAMMING (OPEN ELECTIVE)","SYSTEM SOFTWARE AND COMPILER",
        "SYSTEM SOFTWARE AND OPERATING SYSTEM LABORATORY"};
    }

    private void Computer_Science_Engineering_VII(){
        subjectArr= new String[]{"ADVANCED JAVA AND J2EE","ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING LABORATORY",
        "ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING","BIG DATA AND ANALYTICS","DIGITAL IMAGE PROCESSING",
        "INTRODUCTION TO BIG DATA ANALYTICS","INTRODUCTION TO OPERATING SYSTEM","NETWORK MANAGEMENT","PROGRAMMING IN JAVA",
        "SOFTWARE ARCHITECTURE AND DESIGN PATTERNS","STORAGE AREA NETWORKS","WEB TECHNOLOGY AND ITS APPLICATIONS"};
    }

    private void Computer_Science_Engineering_VIII(){
        subjectArr= new String[]{"ADVANCED COMPUTER ARCHITECTURES","INTERNET OF THINGS","MOBILE COMPUTING",
        "NOSQL DATABASE"};
    }
    

    private void Electrical_Electronics_Engineering_III(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – I","ANALOG ELECTRONIC CIRCUITS","Aadalitha Kannada",
        "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)","DIGITAL SYSTEM DESIGN","ELECTRIC CIRCUIT ANALYSIS",
        "ELECTRICAL AND ELECTRONIC MEASUREMENTS","ELECTRICAL MACHINES LABORATORY - 1","ELECTRONICS LABORATORY",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES","TRANSFORMERS AND GENERATORS",
        "Vyavaharika Kannada"};
    }

    private void Electrical_Electronics_Engineering_IV(){
        subjectArr= new String[]{"ADDITIONAL MATHEMATICS – II","COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
        "ELECTRIC MOTORS","ELECTRICAL MACHINES LABORATORY - 2","ELECTROMAGNETIC FIELD THEORY","OP- AMP AND LINEAR ICS LABORATORY",
        "OPERATIONAL AMPLIFIERS AND LINEAR ICs","POWER GENERATION AND ECONOMICS","TRANSMISSION AND DISTRIBUTION"};
    }

    private void Electrical_Electronics_Engineering_V(){
        subjectArr= new String[]{"ELECTRICAL MACHINE DESIGN (Core Course)","ENVIRONMENTAL STUDIES","HIGH VOLTAGE ENGINEERING",
        "MANAGEMENT AND ENTREPRENEURSHIP","MICROCONTROLLER LABORATORY","MICROCONTROLLER","POWER ELECTRONICS LABORATORY",
        "POWER ELECTRONICS","SIGNALS AND SYSTEMS"};
    }

    private void Electrical_Electronics_Engineering_VI(){
        subjectArr= new String[]{"COMPUTER AIDED ELECTRICAL DRAWING (PROFESSIONAL","CONTROL SYSTEM LABORATORY","CONTROL SYSTEMS (Core Subject)",
        "DIGITAL SIGNAL PROCESSING (Core Subject)","DIGITAL SIGNAL PROCESSING LABORATORY","ELECTRICAL ENGINEERING MATERIALS (Professional Elective)",
        "EMBEDDED SYSTEMS (PROFESSIONAL ELECTIVE)","INDUSTRIAL SERVO CONTROL SYSTEMS(Open Elective)","INTRODUCTION TO NUCLEAR POWER ( PROFESSIONAL ELECTIVE )",
        "OBJECT ORIENTED PROGRAMMING USING C++ (PROFESSIONAL ELECTIVE)","PLC and SCADA (Open Elective)","POWER SYSTEM ANALYSIS – 1 (Core Subject)",
        "RENEWABLE ENERGY RESOURCES( Open Elective )","TESTING AND COMMISSIONING OF POWER SYSTEM APPARATUS (Open Elective)"};
    }

    private void Electrical_Electronics_Engineering_VII(){
        subjectArr= new String[]{"ADVANCED CONTROL SYSTEMS (Professional Elective)","ARTIFICIAL NEURAL NETWORK WITH APPLICATIONS TO POWER SYSTEMS (Professional Elective)",
        "ELECTRIC VEHICLES (Open Elective)","ELECTRICAL ENERGY CONSERVATION AND AUDITING (Open Elective)","INDUSTRIAL DRIVES AND APPLICATIONS (Professional Elective)",
        "INDUSTRIAL MOTORS & CONTROL ( Open Elective )","INTEGRATION OF DISTRIBUTED GENERATION(Professional Elective)",
        "PLC and SCADA(Professional Elective)","POWER SYSTEM ANALYSIS – 2(Core Course)","POWER SYSTEM PROTECTION (Core Subject)",
        "POWER SYSTEM SIMULATION LABORATORY","PROJECT PHASE – I","REACTIVE POWER CONTROL IN ELECTRIC POWER SYSTEMS (Professional Elective)",
        "RELAY AND HIGH VOLTAGE LABORATORY","SENSORS AND TRANSDUCERS (Open Elective)","SENSORS AND TRANSDUCERS (Professional Elective)",
        "SMART GRID ( Professional Elective)","SOLAR AND WIND ENERGY (Professional Elective)","UTILIZATION OF ELECTRICAL POWER(Professional Elective)"};
    }

    private void Electrical_Electronics_Engineering_VIII(){
        subjectArr= new String[]{"ELECTRIC VEHICLE TECHNOLOGIES (Professional Elective)","ELECTRICAL ESTMATION AND COSTING (Professional Elective)",
        "ELECTRICAL POWER QUALITY (Professional Elective)","FACTS AND HVDC TRANSMISSION ( Professional Elective )",
        "INTERNSHIP","POWER SYSTEM OPERATION AND CONTROL(Core Course)","POWER SYSTESMEMPELSATNENRIN-VGII(PI rofessional Elective)"};
    }
    

    private void Electronics_Communication_Engineering_III(){

    }

    private void Electronics_Communication_Engineering_IV(){

    }

    private void Electronics_Communication_Engineering_V(){

    }

    private void Electronics_Communication_Engineering_VI(){

    }

    private void Electronics_Communication_Engineering_VII(){

    }

    private void Electronics_Communication_Engineering_VIII(){

    }

    
    private void Electronics_Instrumentation_Engineering_III(){

    }

    private void Electronics_Instrumentation_Engineering_IV(){

    }

    private void Electronics_Instrumentation_Engineering_V(){

    }

    private void Electronics_Instrumentation_Engineering_VI(){

    }

    private void Electronics_Instrumentation_Engineering_VII(){

    }

    private void Electronics_Instrumentation_Engineering_VIII(){

    }
    

    private void Electronics_Telecommunication_Engineering_III(){

    }

    private void Electronics_Telecommunication_Engineering_IV(){

    }

    private void Electronics_Telecommunication_Engineering_V(){

    }

    private void Electronics_Telecommunication_Engineering_VI(){

    }

    private void Electronics_Telecommunication_Engineering_VII(){

    }

    private void Electronics_Telecommunication_Engineering_VIII(){

    }
    

    private void Industrial_Production_Engineering_III(){

    }

    private void Industrial_Production_Engineering_IV(){

    }

    private void Industrial_Production_Engineering_V(){

    }

    private void Industrial_Production_Engineering_VI(){

    }

    private void Industrial_Production_Engineering_VII(){

    }

    private void Industrial_Production_Engineering_VIII(){

    }

    
    private void Industrial_Engineering_Management_III(){

    }

    private void Industrial_Engineering_Management_IV(){

    }

    private void Industrial_Engineering_Management_V(){

    }

    private void Industrial_Engineering_Management_VI(){

    }

    private void Industrial_Engineering_Management_VII(){

    }

    private void Industrial_Engineering_Management_VIII(){

    }

   

    private void Information_Science_Engineering_III(){

    }

    private void Information_Science_Engineering_IV(){

    }

    private void Information_Science_Engineering_V(){

    }

    private void Information_Science_Engineering_VI(){

    }

    private void Information_Science_Engineering_VII(){

    }

    private void Information_Science_Engineering_VIII(){

    }

    

    private void Manufacturing_Science_Engineering_III(){

    }

    private void Manufacturing_Science_Engineering_IV(){

    }

    private void Manufacturing_Science_Engineering_V(){

    }

    private void Manufacturing_Science_Engineering_VI(){

    }

    private void Manufacturing_Science_Engineering_VII(){

    }

    private void Manufacturing_Science_Engineering_VIII(){

    }

    

    private void Marine_Engineering_III(){

    }

    private void Marine_Engineering_IV(){

    }

    private void Marine_Engineering_V(){

    }

    private void Marine_Engineering_VI(){

    }

    private void Marine_Engineering_VII(){

    }

    private void Marine_Engineering_VIII(){

    }

    

    private void Mechanical_Engineering_III(){

    }

    private void Mechanical_Engineering_IV(){

    }

    private void Mechanical_Engineering_V(){

    }

    private void Mechanical_Engineering_VI(){

    }

    private void Mechanical_Engineering_VII(){

    }

    private void Mechanical_Engineering_VIII(){

    }

   

    private void Mechatronics_III(){

    }

    private void Mechatronics_IV(){

    }

    private void Mechatronics_V(){

    }
   
    private void Mechatronics_VI(){

    }

    private void Mechatronics_VII(){

    }

    private void Mechatronics_VIII(){

    }

   

    private void  Medical_Electronics_III(){

    }

    private void  Medical_Electronics_IV(){

    }

    private void  Medical_Electronics_V(){

    }

    private void  Medical_Electronics_VI(){

    }

    private void  Medical_Electronics_VII(){

    }

    private void  Medical_Electronics_VIII(){

    }

    

    private void Mining_Engineering_III(){

    }

    private void Mining_Engineering_IV(){

    }

    private void Mining_Engineering_V(){

    }

    private void Mining_Engineering_VI(){

    }

    private void Mining_Engineering_VII(){

    }

    private void Mining_Engineering_VIII(){

    }

    

    private void Nano_Technology_III(){

    }

    private void Nano_Technology_IV(){

    }

    private void Nano_Technology_V(){

    }

    private void Nano_Technology_VI(){

    }

    private void Nano_Technology_VII(){

    }

    private void Nano_Technology_VIII(){

    }

   

    private void Petrochem_Engineering_III(){

    }

    private void Petrochem_Engineering_IV(){

    }

    private void Petrochem_Engineering_V(){

    }

    private void Petrochem_Engineering_VI(){

    }

    private void Petrochem_Engineering_VII(){

    }

    private void Petrochem_Engineering_VIII(){

    }
}
