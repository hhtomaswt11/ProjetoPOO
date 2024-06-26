/*
 * This file was automatically generated by EvoSuite
 * Thu May 02 15:23:29 GMT 2024
 */

package com.myapplication.projetopoo2324.atividade.tiposdeatividade.distanciaaltimetria;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.myapplication.projetopoo2324.atividade.Atividade;
import com.myapplication.projetopoo2324.atividade.TipoAtividade;
import com.myapplication.projetopoo2324.atividade.tiposdeatividade.distanciaaltimetria.DistanciaAltimetria;
import com.myapplication.projetopoo2324.planodetreino.PlanoDeTreino;
import com.myapplication.projetopoo2324.utilizador.TipoUtilizador;
import com.myapplication.projetopoo2324.utilizador.Utilizador;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DistanciaAltimetria_ESTest extends DistanciaAltimetria_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA;
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("/Ac~ +X/lN@D]", tipoAtividade0, 5009.2, 1, 5009.2, 106.90134532, localDateTime0);
      distanciaAltimetria0.setNome("SEGUNDA");
      distanciaAltimetria0.getNome();
      assertEquals(5009.2, distanciaAltimetria0.getDistancia(), 0.01);
      assertEquals(106.90134532, distanciaAltimetria0.getAltimetria(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("", tipoAtividade0, 0.0, 125, 0.0, 1385.4463140437845, (LocalDateTime) null);
      distanciaAltimetria0.setNome("");
      distanciaAltimetria0.getNome();
      assertEquals(0.0, distanciaAltimetria0.getDistancia(), 0.01);
      assertEquals(1385.4463140437845, distanciaAltimetria0.getAltimetria(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("", tipoAtividade0, 0.0, 125, 0.0, 1385.4463140437845, (LocalDateTime) null);
      distanciaAltimetria0.setIteracoes(125);
      int int0 = distanciaAltimetria0.getIteracoes();
      assertEquals(125, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(6, 6);
      Clock clock0 = MockClock.system(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria(":pYA\".wI9Cw@&d/8", tipoAtividade0, 1395.0695933, 6, 0.0, 0.0, localDateTime0);
      double double0 = distanciaAltimetria0.getDistancia();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, distanciaAltimetria0.getAltimetria(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("", tipoAtividade0, 0.0, 125, 0.0, 1385.4463140437845, (LocalDateTime) null);
      distanciaAltimetria0.setDistancia(3905.448307538312);
      double double0 = distanciaAltimetria0.getDistancia();
      assertEquals(3905.448307538312, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.REPETICOES_COM_PESOS;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("DIARIA", tipoAtividade0, 0.0, 1583, 1583, 0.0, (LocalDateTime) null);
      double double0 = distanciaAltimetria0.getAltimetria();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1583.0, distanciaAltimetria0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("DsuOR", tipoAtividade0, (-903.014535102353), (-2543), (-2543), (-903.014535102353), (LocalDateTime) null);
      double double0 = distanciaAltimetria0.getAltimetria();
      assertEquals((-903.014535102353), double0, 0.01);
      assertEquals((-2543.0), distanciaAltimetria0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(6, 6);
      Clock clock0 = MockClock.system(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria(":pYA\".wI9Cw@&d/8", tipoAtividade0, 1395.0695933, 6, 0.0, 0.0, localDateTime0);
      TipoUtilizador tipoUtilizador0 = TipoUtilizador.PRATICANTE_OCASIONAL;
      Utilizador utilizador0 = new Utilizador();
      List<PlanoDeTreino> list0 = utilizador0.getPlanosDeTreino();
      LinkedList<PlanoDeTreino> linkedList0 = new LinkedList<PlanoDeTreino>(list0);
      List<Atividade> list1 = utilizador0.getAtividadesIsoladas();
      Utilizador utilizador1 = new Utilizador("KBF45j)1SkTMKh6", "Atividade isolada realizada registrada com sucesso!", "R^U;otTE", 0.0, tipoUtilizador0, linkedList0, list1);
      double double0 = distanciaAltimetria0.calcularCalorias(utilizador1);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, distanciaAltimetria0.getDistancia(), 0.01);
      assertEquals(0.0, distanciaAltimetria0.getAltimetria(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.system(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("oN|kSA(Nv3`(r", tipoAtividade0, 3422.5, 479, 3422.5, 0.1, localDateTime0);
      TipoUtilizador tipoUtilizador0 = TipoUtilizador.PRATICANTE_OCASIONAL;
      Utilizador utilizador0 = new Utilizador();
      List<PlanoDeTreino> list0 = utilizador0.getPlanosDeTreino();
      LinkedList<Atividade> linkedList0 = new LinkedList<Atividade>();
      Utilizador utilizador1 = new Utilizador("", "", "1a;z", 0.1, tipoUtilizador0, list0, linkedList0);
      double double0 = distanciaAltimetria0.calcularCalorias(utilizador1);
      assertEquals(1369.008, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("", tipoAtividade0, 85.821710331712, (-3731), 1.2, 1093.87933401, (LocalDateTime) null);
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        distanciaAltimetria0.calcularCalorias(utilizador0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.myapplication.projetopoo2324.utilizador.Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.system(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("oN|kSA(Nv3`(r", tipoAtividade0, 3422.5, 479, 3422.5, 0.1, localDateTime0);
      double double0 = distanciaAltimetria0.getAltimetria();
      assertEquals(0.1, double0, 0.01);
      assertEquals(3422.5, distanciaAltimetria0.getDistancia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("com.myapplication.projetopoo2324.atividade.tiposdeatividade.distanciaaltimetria.DistanciaAltimetria", tipoAtividade0, 0.0, (-2783), (-2783), (-1553.81), (LocalDateTime) null);
      distanciaAltimetria0.setIteracoes((-2783));
      int int0 = distanciaAltimetria0.getIteracoes();
      assertEquals((-2783), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("com.myapplication.projetopoo2324.atividade.tiposdeatividade.distanciaaltimetria.DistanciaAltimetria", tipoAtividade0, 0.0, (-2783), (-2783), (-1553.81), (LocalDateTime) null);
      TipoUtilizador tipoUtilizador0 = TipoUtilizador.PRATICANTE_OCASIONAL;
      Utilizador utilizador0 = new Utilizador("Ll%{Y=,?u=:'", "Ll%{Y=,?u=:'", "com.myapplication.projetopoo2324.atividade.tiposdeatividade.distanciaaltimetria.DistanciaAltimetria", 0.0, tipoUtilizador0);
      double double0 = distanciaAltimetria0.calcularCalorias(utilizador0);
      assertEquals((-1237.5048000000002), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("com.myapplication.projetopoo2324.atividade.tiposdeatividade.distanciaaltimetria.DistanciaAltimetria", tipoAtividade0, 0.0, (-2783), (-2783), (-1553.81), (LocalDateTime) null);
      double double0 = distanciaAltimetria0.getDistancia();
      assertEquals((-2783.0), double0, 0.01);
      assertEquals((-1553.81), distanciaAltimetria0.getAltimetria(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("com.myapplication.projetopoo2324.atividade.tiposdeatividade.distanciaaltimetria.DistanciaAltimetria", tipoAtividade0, 0.0, (-2783), (-2783), (-1553.81), (LocalDateTime) null);
      int int0 = distanciaAltimetria0.getIteracoes();
      assertEquals((-2783.0), distanciaAltimetria0.getDistancia(), 0.01);
      assertEquals((-1553.81), distanciaAltimetria0.getAltimetria(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA_ALTIMETRIA;
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.system(zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("oN|kSA(Nv3`(r", tipoAtividade0, 3422.5, 479, 3422.5, 0.1, localDateTime0);
      assertEquals(0.1, distanciaAltimetria0.getAltimetria(), 0.01);
      
      distanciaAltimetria0.setAltimetria(0.0);
      assertEquals(0.0, distanciaAltimetria0.getAltimetria(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TipoAtividade tipoAtividade0 = TipoAtividade.DISTANCIA;
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      DistanciaAltimetria distanciaAltimetria0 = new DistanciaAltimetria("/Ac~ +X/lN@D]", tipoAtividade0, 5009.2, 1, 5009.2, 106.90134532, localDateTime0);
      distanciaAltimetria0.getNome();
      assertEquals(5009.2, distanciaAltimetria0.getDistancia(), 0.01);
      assertEquals(106.90134532, distanciaAltimetria0.getAltimetria(), 0.01);
  }
}
