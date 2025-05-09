package org.utilities;

import java.nio.file.Paths;
import java.util.Map;

public class AppConfig {

    private static final Map<String, String[]> appDataMap = Map.ofEntries(
                    //1.companycode          //2.app activity package  //3.Menu list order //4.share graph link                                                                     //5.financial calendar link                            //6.press release link  //7.keyfiguresAnnualExcelFile  //8.interactive analysis link(iat)  //9.Document Library File              //10.share price lookup link (spl)                                       //11.total shareholders return link(TSR)         //12.Analyst Ratings link
            Map.entry("acwa", new String[]{"com.euroland.irapp.sa_acwa", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EYy9g1F1dQBFtxXKxBCgDqEBMRnHGUNkzuGHcysDmjsi8Q?e=G73QbA", "https://gamma.euroland.com/tools/sharegraph/?s=2033&companycode=sa-acwa&lang=en-GB", "https://gamma.euroland.com/tools/fincalendar2/?companycode=sa-acwa&lang=en-GB", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-acwa&lang=en-GB", "", "https://ksatools.eurolandir.com/tools/ia/?companycode=sa-acwa&lang=en-gb", "", "https://gamma.euroland.com/tools/splookup/?companycode=sa-acwa&lang=en-GB", "https://tools.eurolandir.com/tools/tsr/iframe/?companycode=sa-acwa&lang=en-GB", ""}),
            Map.entry("ades", new String[]{"com.euroland.irapp.eg_ades", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EUMMzXMPOblLrFAXN25tZbcB2I8g1vtjPU3ijZU1DFIhMw?e=CXXbJ7", "https://ksatools.eurolandir.com/sharegraph/?s=2839&companycode=EG-ADES&lang=en-gb", "https://ksatools.eurolandir.com/tools/fincalendar2/?companycode=EG-ADES&lang=en-GB", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=EG-ADES&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("adib", new String[]{"com.euroland.irapp.ae_adib", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Ef_WS4VY01JEhepP1KZVJwQBU1U2p8oX4rPu--mNv2wTEw?e=42wzm0", "https://tools.eurolandir.com/tools/sharegraph/?s=2077&companycode=ae-adib&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=ae-adib&lang=en-GB", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-adib&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("advanced", new String[]{"com.euroland.irapp.sa_2330","https://azureeuroland.sharepoint.com/:x:/s/PSS/EcB7D0WCqFFKgbegUFdojFcBSM40FSCUpakUsxD5uYmG7g?e=UtpNJA", "", "", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-2330&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("agthia", new String[]{"com.euroland.mobiletools.ae_agthia", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EVOmj0D1m45Kk9nkYpZZU2MBfy1IzNlAZm2MsOi1jX96jQ?e=yUlMRF", "https://tools.eurolandir.com/tools/sharegraph/?s=1820&companycode=ae-agthia&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=ae-agthia&v=redesign&lang=en-GB", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-agthia&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("alarabia", new String[]{"com.euroland.irapp.sa_4071", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EW2WaxFGf6lKoXw6preEJuIBD_r4nviZORLiKlZ8QdZglg?e=qDyAGc", "", "", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=SA-4071&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("almazaya", new String[]{"com.euroland.mobiletools.ae_mazaya", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EZBCNL5JKeJCq8Gs-gWNA64BtRXk47wx0JsWWcw31L7q6g?e=OvKvX4", "https://tools.euroland.com/tools/sharegraph/?s=790&companycode=ae-mazaya&lang=en-gb", "https://tools.euroland.com/tools/fincalendar2/?companycode=ae-mazaya&lang=en-gb", "http://tools.euroland.com/tools/sharegraph/?s=790&companycode=ae-mazaya&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("alrajhi", new String[]{"", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ET3Ssck4OEBKvhXIVs6RFisB5yzm0eyD1aZJ_U3dw83M-A?e=PAzxIf", "https://tools.eurolandir.com/tools/sharegraph/?s=2559&companycode=sa-rjhi&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=sa-rjhi&v=r2022&lang=en-GB", "https://tools.eurolandir.com/tools/pressreleases/?companycode=sa-rjhi&v=r2022&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("alandalus", new String[]{"com.euroland.irapp.sa_4320", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ESXI-LgB939OvN2hY3wAIywBvNqlSwdfJXlddrvkg3v-hA?e=GmKUwQ", "https://gamma.euroland.com/tools/sharegraph/?s=3143&companycode=sa-4320&lang=en-GB", "https://gamma.euroland.com/tools/fincalendar2/?companycode=sa-4320&lang=en-GB", "https://gamma.euroland.com/tools/pressreleases/?companycode=sa-4320&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("alinma", new String[]{"com.euroland.irapp.sa_1150", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EesV467RjapCrPd4x9aZ-18BoFTE_55XHlHWXtuKMxbxCw?e=fdOQqo", "", "", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-1150&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("alma", new String[]{"com.euroland.mobiletools.sf_aln", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EQCvV773DetBqA5mYwTXTqMBONaXh8x6cOlLWtazSpmtVQ?e=pIbdgi", "https://tools.euroland.com/tools/sharegraph/?s=650&companycode=sf-aln&lang=en-gb", "https://tools.euroland.com/tools/FinCalendar2/?companycode=sf-aln&lang=en-gb", "https://tools.euroland.com/tools/sharegraph/?s=650&companycode=sf-aln&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("almarai", new String[]{"com.euroland.mobiletools.sa_2280", "", "https://ksatools.eurolandir.com/tools/sharegraph/?s=2495&companycode=sa-2280&lang=en-GB", "https://ksatools.eurolandir.com/tools/fincalendar2/?companycode=sa-2280&v=r2022&lang=en-GB#", "https://tools.eurolandir.com/tools/pressreleases/?companycode=sa-2280&v=r2022&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("alpha", new String[]{"com.euroland.irapp.ae_alpha", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EU-TX-xPxhJKqTevLhJtXXMBfadiZS-E8knifr0dH6OOBw?e=7x2tJT", "https://tools.eurolandir.com/tools/sharegraph/?s=2556&companycode=ae-alpha&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=ae-alpha&v=redesign&lang=en-GB", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-alpha&v=redesign&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("alujain", new String[]{"com.euroland.irapp.sa_2170", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EfzhNzZOxm1FkBJ92wnnRN0B2oqSQ1N1DKE6hvuQ5S5mxQ?e=84JB8U", "https://tools.eurolandir.com/tools/sharegraph/?s=3066&companycode=sa-2170&lang=en-GB", "https://gamma.euroland.com/tools/fincalendar2/?companycode=sa-2170&lang=en-gb", "https://tools.eurolandir.com/tools/pressreleases/?companycode=sa-2170&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("aqua", new String[]{"com.euroland.irapp.ae_aqua", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Ec_hANzrcWdBg4pPSqiDwm8BRKLgBLH4RJL1wPEGM-iPbg?e=VXE4Wk", "https://gamma.euroland.com/tools/sharegraph/?s=3185&companycode=AE-AQUA&lang=en-GB", "https://gamma.euroland.com/tools/fincalendar2/?companycode=AE-AQUA&lang=en-GB", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-aqua&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("arab", new String[]{"com.euroland.irapp.jo_arbk", "", "https://tools.eurolandir.com/tools/sharegraph/?s=1789&companycode=jo-arbk&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=jo-arbk&lang=en-GB", "https://tools.eurolandir.com/tools/sharegraph/?s=1789&companycode=jo-arbk&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("arabian", new String[]{"com.euroland.irapp.sa_arab", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EU3S0QLMr-5LmiLTT39TcdUBaecMcN8pfbE0cC8YWB5QKQ?e=fc8pbk", "https://ksatools.eurolandir.com/sharegraph/?s=2594&companycode=sa-arab&lang=en-GB", "https://ksatools.eurolandir.com/tools/fincalendar2/?companycode=sa-arab&lang=en-GB", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-arab&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("aramex", new String[]{"com.euroland.irapp.ae_armx", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ETQG_JMpA3pHkFEDfBOO5sEBIWuwM9OH6ONA1wmFNOdMsw?e=Qq4F8h", "https://tools.eurolandir.com/tools/sharegraph/?s=1721&companycode=ae-armx&lang=en-GB", "https://tools.eurolandir.com/tools/sharegraph/?s=1721&companycode=ae-armx&lang=en-GB", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-armx&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("assa", new String[]{"com.euroland.irapp.s_assa", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EVXuSA_mqoBAtZrqeEHP7ugBixbwK-8Lj8yrTEqSjD8giA?e=2lxSZf", "https://tools.eurolandir.com/tools/sharegraph/?s=2562&companycode=S-ASSA&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=S-ASSA&lang=en-GB", "https://tools.eurolandir.com/tools/pressreleases/?companycode=S-ASSA&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("bahri", new String[]{"com.euroland.mobiletools.sa_bahri", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EXbnSu6D061KjIY4BQbRPeABxZt0J9_t5NAVVN9ioe8Drw?e=1p810T", "https://tools.eurolandir.com/tools/sharegraph/?s=1858&companycode=sa-bahri&lang=en-gb", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=sa-bahri&v=redesign&lang=en-gb", "https://tools.eurolandir.com/tools/pressreleases/?companycode=sa-bahri&v=redesign&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("banco", new String[]{"com.euroland.irapp.es_bsd", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ETrQDpJKaeJDjRPa3pOb4mABnx1M6AxL5KYQOd9THtFSnQ?e=hUfWPc", "https://tools.eurolandir.com/tools/sharegraph3?companycode=es-bsd&v=es-bsd&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=es-bsd&lang=en-GB", "https://tools.eurolandir.com/tools/sharegraph/?s=3082&companycode=es-bsd&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("bat", new String[]{"com.bat.iriphone", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EQLfWx4UiJBMgUZAwJAC2FIBWRsb0xZNbOz0Or99FTqxqg?e=mKNJFm", "", "", "", "", "", "", "", "", ""}),
            Map.entry("bsf", new String[]{"com.euroland.irapp.sa_bsf", "", "https://tools.eurolandir.com/tools/sharegraph3?companycode=es-bsd&v=es-bsd&lang=en-GB", "https://tools.eurolandir.com/tools/FinCalendar2/?companycode=sa-bsf&lang=en-gb", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-bsf&v=r2023&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("clp", new String[]{"com.euroland.irapp.hk_2", "", "", "", "https://tools.eurolandir.com/tools/pressreleases/?companycode=HK-2&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("cbq", new String[]{"com.euroland.irapp.qa_3y5a", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EQLfWx4UiJBMgUZAwJAC2FIBWRsb0xZNbOz0Or99FTqxqg?e=mKNJFm", "https://tools.eurolandir.com/tools/sharegraph/?s=2940&companycode=QA-3Y5A&lang=en-GB", "https://tools.eurolandir.com/tools/fincalendar2/?companycode=QA-3Y5A&v=r2023&lang=en-GB", "https://tools.euroland.com/tools/pressreleases/?companycode=qa-3y5a&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("corelab", new String[]{"com.euroland.irapp.nl_clb", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EXUlrIK3EbNDpLlBc-dAjfwBmQdeT2v55O39PlUB9M9AWw?e=mqKQcw", "", "", "", "", "", "", "", "", ""}),
            Map.entry("dar", new String[]{"com.euroland.mobiletools.sa_4300", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EexyfwEnWvpIjJEtYqq48gEBLODAsuBsNjy_OGkX1o6FaA?e=2mz3a9", "", "", "https://tools.eurolandir.com/tools/pressreleases/?companycode=sa-4300&v=r2021&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("deyaar", new String[]{"com.euroland.mobiletools.ae_deyaar", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EdTqHWsSmx5FgbCUYljh-RAB9ptCfIriZ3J0KJzcuD5D5Q?e=ZTOdGb", "", "", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-deyaar&v=r2023&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("dfm", new String[]{"com.euroland.mobiletools.ae_dfm", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EdN5TbSpjmJEhtJKSWAH5BUBHyGEypkbmXn1yzG6au_jJw?e=urcq8W", "", "", "http://tools.euroland.com/tools/pressreleases/?companycode=ae-dfm&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("dpworld", new String[]{"com.euroland.mobiletools.ae_dpw", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EWM-CR4tMW5AtEHHpge_j0YBhpthJUFd0O1jGVgrb5nkBg?e=obPIHo", "", "", "https://tools.eurolandir.com/tools/sharegraph/?s=1446&companycode=ae-dpw&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("hmg", new String[]{"com.euroland.irapp.sa_hmg", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EVw0Z4p1RAFGhjpABL4hw3EBreg2RbpDfAfgPktRwZcUbw?e=BRVLvu", "", "", "https://tools.eurolandir.com/tools/pressreleases/?companycode=sa-hmg&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("dukhan", new String[]{"com.euroland.irapp.qa_dukb", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ESlDC8F2wZpKo94pYFex8c0BJSwdmLz4xl4OvzaFuSfVHA?e=1rcKwl", "", "", "https://tools.eurolandir.com/tools/pressreleases/?companycode=QA-DUKB&lang=en-gb", "", "", "", "", "", ""}),
            Map.entry("elm", new String[]{"com.euroland.irapp.sa_elm", "https://azureeuroland.sharepoint.com/:x:/r/sites/PSS/_layouts/15/Doc.aspx?sourcedoc=%7B3b1f9b38-4c53-4402-9121-8df8291744b6%7D&action=editnew", "", "", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-elm&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("emmardev", new String[]{"com.euroland.irapp.ae_emaarde", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EdA0SgZYRzBOhBdxW7F91NEBWYWmsBkMf1LGrOdEeYbfdQ?e=yfdM4R", "", "", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-emaarde&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("emmarprop", new String[]{"com.euroland.mobiletools.ae_emaar", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Ef9idPk9sltLqQCrsUo2Gc0BmuHavjZEG4z89Fbt0GPAqA?e=VHNMqW", "", "", "https://tools.eurolandir.com/tools/pressreleases/?companycode=ae-emaarde&lang=en-GB", "", "", "", "", "", ""}),
            Map.entry("emsteel", new String[]{"com.euroland.irapp.ae_arkan", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EV4I7_JpcvFDhpo1T109Aq4B_9BX33qgwHxJYBuWIBshOQ?e=qLtV03", "", "", "", "", "", "", "", "", ""}),
            Map.entry("esg", new String[]{"com.euroland.irapp.ae_esg", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EZPyksdbo1pKska0H4Blf3MBdejDZdwz0KZFA02w6_l3nw?e=i0U83H", "", "", "", "", "", "", "", "", ""}),
            Map.entry("fab", new String[]{"com.euroland.mobiletools.ae_nbad", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EW84k4Njij9LrvvAAzysBVQB5ULsOUsn_qdI5nG7yEr0xQ?e=FcvAki", "", "", "", "", "", "", "", "", ""}),
            Map.entry("fortum", new String[]{"com.euroland.mobiletools.sf_fum", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ESm9ANXFkyBKuuzTqEtXS04BcvDyhB69FKPaVgeRjBUhzg?e=f1dhef", "", "", "", "", "", "", "", "", ""}),
            Map.entry("ihc", new String[]{"com.euroland.irapp.ae_asmak", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EXKptaVwCu1LpcBMxSnO6osBw-Tw6Gik9m-fps3-hWcvAw?e=QRfYJe", "", "", "", "", "", "", "", "", ""}),
            Map.entry("jahez", new String[]{"com.euroland.irapp.sa_9526", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EUKK0ZU4ivlHkxLGzswkt1wBICG3RJfGoPUY-XlVMcc_Sw?e=Cqt0oI", "https://ksatools.eurolandir.com/tools/sharegraph/?s=2388&companycode=sa-9526&lang=en-GB", "https://ksatools.eurolandir.com/tools/fincalendar2/?companycode=sa-9526&lang=en-GB", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-9526&lang=en-GB", "", "https://ksatools.eurolandir.com/tools/ia/?companycode=SA-9526&lang=en-GB", "", "", "https://ksatools.eurolandir.com/tools/tsr/iframe/?companycode=sa-9526&lang=en-GB", ""}),
            Map.entry("kddi", new String[]{"com.euroland.irapp.jp_dip", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EZIvc3gIMlVAsqi0QlQYNGEBMaoh1Qv_USIOG5IK-8JdjA?e=yMM2iw", "", "", "", "", "", "", "", "", ""}),
            Map.entry("kingdom", new String[]{"com.euroland.irapp.sa_4280", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Eauzu-NikShDmitLW9OfF_MBqS1rsJ3EWupDc9yDrojm_g?e=nDCAid", "", "", "", "", "", "", "", "", ""}),
            Map.entry("lindex", new String[]{"com.euroland.irapp.sf_sto", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Ef0T0nsx83JLibFDlV_RgUMBYT2KcHPHy3NfKBn0NYdk-g?e=Zb9qDz", "", "", "", "", "", "", "", "", ""}),
            Map.entry("maaden", new String[]{"com.euroland.mobiletools.sa_maaden", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Ee2DufJvyL1Bi3fg70Qa4S0BFG26yLSpYp0DatyV9WD5Ew?e=zoB5co", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mashreq", new String[]{"com.euroland.irapp.ae_masq", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("masraf", new String[]{"com.euroland.irapp.qa_mark", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EXKEk9OZrW9Fuf9jl31TwhgBh-QszwBaUEShRWF937-cFw?e=aVNfvl", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mbc", new String[]{"com.euroland.irapp.sa_mbc", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EW3uhzRFOd1EuTQ3NeqcNLkBHpC3m9zt2xD5p9H67bsRng?e=laE007", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mobily", new String[]{"com.euroland.irapp.sa_7020", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EVygU-RdsulMho-uaWmU8_8BGfKPQS_0SICJVO2fdf2rDA?e=uvRtMw", "", "", "", "", "", "", "", "", ""}),
            Map.entry("modern", new String[]{"com.euroland.irapp.sa_mill", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ESQ3vZWjZktIlP06hfI-_sABypDpnb851h_Ibs5qAAAwqw?e=dxCghw", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mondon", new String[]{"com.euroland.irapp.ae_alqudra", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ET02vbq0RahGms8m9zNtOC4BEIdtwTQL8V_9HLR7g6NbQg?e=BUPdwQ", "", "", "", "", "", "", "", "", ""}),
            Map.entry("multiply", new String[]{"com.euroland.mobiletools.ae_multi", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EXGwmJgQ9-dPsZ44Pz0Z-hMBprohLu1Q3056h_Gi7wzSfg?e=CChGfX", "", "", "", "", "", "", "", "", ""}),
            Map.entry("nbf", new String[]{"com.euroland.mobiletools.ae_nbf", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EXGwmJgQ9-dPsZ44Pz0Z-hMBprohLu1Q3056h_Gi7wzSfg?e=CChGfX", "", "", "", "", "", "", "", "", ""}),
            Map.entry("nbo", new String[]{"com.nbo.ir", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EWayWhXgHuRBtcap3R8p6BwBMT8JPjOwVkww3R9agXh7yg?e=BvWEfu", "", "", "", "", "", "", "", "", ""}),
            Map.entry("nmdc", new String[]{"com.euroland.irapp.ae_nmdcenr", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EU0h_VT3OndIhclxuwPkqrIBiLiIMok-hDpr1uOTqlW4Hg?e=P4s7YX", "", "", "", "", "", "", "", "", ""}),
            Map.entry("omantel", new String[]{"com.euroland.mobiletools.om_otel", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EV12lp7CkxNDpaNefzkXa7YBsupElLvtJKJVAo6D7UeR-g?e=4tYNRF", "", "", "", "", "", "", "", "", ""}),
            Map.entry("ooredoo", new String[]{"com.euroland.mobiletools.ae_qtel", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EaR-9BjGAcpGumw0AqsEeI4BgY179G59ZjXPwJuU4ov4Wg?e=OcH8I5", "", "", "", "", "", "", "", "", ""}),
            Map.entry("ooredoooman", new String[]{"com.euroland.irapp.om_ords", "https://azureeuroland.sharepoint.com/:x:/s/PSS/ERuHyficUlxNj44jIVZUo_oBIxKeeKsfsTpqjK29a2G9uQ?e=o9MBXq", "", "", "", "", "", "", "", "", ""}),
            Map.entry("oqep", new String[]{"com.euroland.irapp.om_oqep", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EfnjUNuY8AlCsXqFVyhmNtoBpn-Kxp7HpyreCVaKZvzs2A?e=5aJNO2", "", "", "", "", "", "", "", "", ""}),
            Map.entry("oqgn", new String[]{"com.euroland.irapp.om_oqgn", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EWGBWwMOAdVJjr87OhCPjOkBT-7NiGb2zMFZuVeYLusCag?e=OYU1cp", "", "", "", "", "", "", "", "", ""}),
            Map.entry("qib", new String[]{"com.euroland.mobiletools.qa_qibk", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EaG-iAUO91xKkCR1nyhPP-IBySl4_6eJpwAuLhChgeRq5A?e=rzG3Fl", "", "", "", "", "", "", "", "", ""}),
            Map.entry("qiib", new String[]{"com.euroland.irapp.qa_qiik", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EUKsXS8nroRKgGr7Dv-QpL4Bf3ZDPJCCCrCWEA7fVY0dcQ?e=0z4nTl", "", "", "", "", "", "", "", "", ""}),
            Map.entry("qnb", new String[]{"com.euroland.irapp.qa_qnbk", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EVHy7cVQcd1NmDfHr7ukFHEB-xEjujL9vnyV0dc6Kp2t9w?e=siPGUL", "", "", "", "", "", "", "", "", ""}),
            Map.entry("riyad", new String[]{"com.euroland.irapp.sa_ribl", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Ed9pPqg6biJFka43YH-RSnEBuMQ6EFzHF2KTOQ1qGko-ww?e=ZcBsh8", "", "", "", "", "", "", "", "", ""}),
            Map.entry("saco", new String[]{"com.euroland.mobiletools.sa_saco", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EX7ZkemeAcJPp6BxYPDxXLgBWchfLjLSk68B48HmlElsvg?e=rL2bnI", "", "", "", "", "", "", "", "", ""}),
            Map.entry("salik", new String[]{"com.euroland.irapp.ae_salik", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EXm8YUAZx1BFiY-xMPbStwUBUZLD_e3nk-VGLGdzZk7KHA?e=SSlYyM", "", "", "", "", "", "", "", "", ""}),
            Map.entry("saib", new String[]{"com.euroland.irapp.sa_1030", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EbADVbWzvitPkDkOgzlcOqUBXo_LB017f0XRBMUivjFTng?e=F7B7v5", "", "", "", "", "", "", "", "", ""}),
            Map.entry("sec", new String[]{"com.euroland.irapp.sa_5110", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("securitas", new String[]{"com.euroland.mobiletools.s_secu", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EfSyQSQLNNxKmAfbsfLqV44B-UZxv5Sq2nS6T2vQzQXjaw?e=F7Z3Z9", "", "", "", "", "", "", "", "", ""}),
            Map.entry("stckw", new String[]{"com.euroland.mobiletools.kw_viva", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EUVtYG5Tfv1OnoVb73D3Tm4BM-Ank65W2vci456T7LYiRw?e=YIgjmI", "", "", "", "", "", "", "", "", ""}),
            Map.entry("uacj", new String[]{"com.euroland.mobiletools.jp_f4m", "https://azureeuroland.sharepoint.com/:x:/s/PSS/Eap6A05YdYBCtsWVyXLdLaoBbpe-hyroOkKjuegEqArnYA?e=YJQyIs", "", "", "", "", "", "", "", "", ""}),
            Map.entry("udc", new String[]{"com.euroland.mobiletools.qa_udcd", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EeyjhixKjnBFti_QRfIn5B8Bg5Mrb2sG1Wli-pceInUumQ?e=xk97j0", "", "", "", "", "", "", "", "", ""}),
            Map.entry("waha", new String[]{"com.euroland.mobiletools.ae_waha", "https://azureeuroland.sharepoint.com/:x:/s/PSS/EVCRJ3JXJ3VNiZUyWjgFD5gBO1X_j6iJr4yIwNqtzFs6bg?e=U0cjBe", "", "", "", "", "", "", "", "", ""}),
            Map.entry("zaingroup", new String[]{"com.euroland.mobiletools.kw_zain", "ZainGroup_MenuListOrder.xlsx", "https://tools.eurolandir.com/tools/sharegraph/?s=2665&companycode=kw-zain&lang=en-GB", "https://tools.euroland.com/tools/FinCalendar2/?companycode=sa-saco&lang=en-gb", "", "AD_shaded_ZainGroup.xlsx", "https://tools.eurolandir.com/tools/ia/?companycode=kw-zain&v=r2022&lang=en-GB", "", "https://tools.eurolandir.com/tools/splookup/?companycode=kw-zain&v=kw-zain_redesign&lang=en-GB", "https://tools.euroland.com/tools/tsr/iframe/?companycode=kw-zain&lang=en-gb", "https://gamma.euroland.com/tools/ee/?companyCode=kw-zain&suffix=r2022&lang=en&pid=5"})



            );

    public static String getAppPackage(String appName) {
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        return (data != null) ? data[0] : "";
    }

    public static String getExcelFilePath(String appName) {
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        if (data != null) {
            String excelFilePath = data[1];
            // Dynamically construct the relative path to the Excel file
            return Paths.get(System.getProperty("user.dir"), "src","test","resources" ,"excel_files","menu_order_files", excelFilePath).toString();
        }
        return "";
    }
    public static String  getShareGraphLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[2];
        }

        return "";
    }
    public static String  getFinancialCalendarLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[3];
        }

        return "";
    }

    public static String  getPressReleaseLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[4];
        }

        return "";
    }

    public static String getKeyFiguresAnnualExcelFilePath(String appName) {
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        if (data != null) {
            String excelFilePath = data[5];
            // Dynamically construct the relative path to the Excel file
            return Paths.get(System.getProperty("user.dir"), "src","test","resources" ,"excel_files","key_figures_files", excelFilePath).toString();
        }
        return "";
    }
    public static String getInteractiveAnalysisLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[6];
        }

        return "";
    }
    public static String  getDocumentLibraryExcelFilePath(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        if (data != null) {
            String excelFilePath = data[7];
            // Dynamically construct the relative path to the Excel file
            return Paths.get(System.getProperty("user.dir"), "src","test","resources" ,"excel_files","", excelFilePath).toString();
        }
        return "";
    }
    public static String  getSharePriceLookupLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[8];
        }

        return "";
    }
    public static String  getTotalShareholdersReturnLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[9];
        }

        return "";
    }
    public static String  getAnalystRatingsLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[10];
        }

        return "";
    }

}
