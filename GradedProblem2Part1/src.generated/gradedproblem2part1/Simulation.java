package gradedproblem2part1;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.processmodeling.*;
import com.anylogic.libraries.modules.markup_descriptors.*;


 


public class Simulation extends ExperimentSimulation<Main> {
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  {
    setCommandLineArguments_xjal( COMMAND_LINE_ARGUMENTS_xjal );
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Simulation.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  // View areas
  @AnyLogicInternalCodegenAPI
  protected static final Font _button_Font = new Font("Dialog", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 0, 24 );
  @AnyLogicInternalCodegenAPI
  protected static final int _button = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;


  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _text:
        if (true) {
          ShapeText self = this.text;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index ) {
    switch( _shape ) {
      case _button: {
          ShapeButton self = this.button;
if ( getState() == IDLE )
	run();
getExperimentHost().setPresentable( getEngine().getRoot() ); 
;}
        break;
      default:
        super.executeShapeControlAction( _shape, index );
        break;
    }
  }

  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _button_SetDynamicParams_xjal( ShapeButton shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setEnabled(
 
);
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
    shape.setTextColor(
 
);
    shape.setFont(
 
);
    shape.setText(
getState() == IDLE ?
	"Run" :
	"Top level agent" 
);
 	}
  }
  
  protected ShapeButton button;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    button = new ShapeButton(
			Simulation.this, true, 40.0, 80.0, 
			100.0, 30.0,
            controlDefault, true,
            _button_Font, 
			"Run" ) {
      @Override
      public void updateDynamicProperties() {
        _button_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _button, 0 );
      }
    };

    text = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 30.0, 0.0, 0.0, 
        royalBlue,"GradedProblem2Part1",
        _text_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

  @Override
  public int getWindowWidth() {
    return 1000;
  }

  @Override
  public int getWindowHeight() {
    return 600;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onDestroy_xjal() {
    super.onDestroy_xjal();
  }

  // Additional class code
 
  // End of additional class code


  @Override
  @AnyLogicInternalCodegenAPI
  public void initDefaultRandomNumberGenerator(Engine _e) {
    _e.getDefaultRandomGenerator().setSeed( 1 );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Main createRoot( Engine engine ) {
    // Create the root object
    return new Main( engine, null, null );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters( final Main self, boolean callOnChangeActions ) {
    final Main root = self; // for compatibility
  }
  

  /**
   * Engine setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupEngine(Engine engine) {
    engine.setATOL( 1.0E-5 );
    engine.setRTOL( 1.0E-5 );
    engine.setTTOL( 1.0E-5 );
    engine.setHTOL( 0.001 );
    engine.setSolverODE( Engine.SOLVER_ODE_EULER );
    engine.setSolverNAE( Engine.SOLVER_NAE_MODIFIED_NEWTON );
    engine.setSolverDAE( Engine.SOLVER_DAE_RK45_NEWTON );
    engine.setVMethods( 427029 );
    engine.setSimultaneousEventsSelectionMode( Engine.EVENT_SELECTION_LIFO );

    engine.setStartTime( 0.0 );
    engine.setTimeUnit( SECOND );
    engine.setStartDate( toDate( 2019, MARCH, 6, 0, 0, 0 ) );
    engine.setStopTime( 800000.0 );
    engine.setRealTimeMode( false );
  }

  /**
   * Experiment setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setup( IExperimentHost _e ) {
    setName( "GradedProblem2Part1 : Simulation" );

    // Static initialization of persistent elements
    _createPersistentElementsBP0_xjal();

    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Simulation.this, true, 0, 0, 0, 0 , text, button );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
    icon = new ShapeModelElementsGroup( Simulation.this, getElementProperty( "gradedproblem2part1.Simulation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    _e.setZoomAndPanningEnabled( true );
    _e.setDeveloperPanelEnabled( true );
    _e.setDeveloperPanelVisibleOnStart( false );
    
 
  }

  @AnyLogicInternalCodegenAPI
  private void onBeforeSimulationRun_xjal( Main root ) {
    // Before simulation run code
    
 
  }

  @AnyLogicInternalCodegenAPI
  private void onAfterSimulationRun_xjal( Main root ) {
    // After simulation run code

 
  }

  {
    addExecutionListener(new ExperimentExecutionListener() {
      private static final long serialVersionUID = 1L;
      
      @Override
      public void onBeforeSimulationRun(Agent root) {
        Simulation.this.onBeforeSimulationRun_xjal((Main) root);
      }
      
      @Override
      public void onAfterSimulationRun(Agent root) {
        Simulation.this.onAfterSimulationRun_xjal((Main) root);
      }
    });
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void reset() {
    
 
  }

}
