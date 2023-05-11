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

import java.awt.geom.Arc2D;

 

public class Main extends Agent
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }




  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // Embedded Objects

 
  public com.anylogic.libraries.processmodeling.Source<
Agent 
> source;
 
  public com.anylogic.libraries.processmodeling.Service<
Agent 
> Repair;
 
  public com.anylogic.libraries.processmodeling.ResourcePool<
Agent 
> Technicians;
 
  public com.anylogic.libraries.processmodeling.Release<
Agent 
> TRelease;
 
  public com.anylogic.libraries.processmodeling.Service<
Agent 
> Test;
 
  public com.anylogic.libraries.processmodeling.ResourcePool<
Agent 
> Jig;
 
  public com.anylogic.libraries.processmodeling.Release<
Agent 
> JRelease;
 
  public com.anylogic.libraries.processmodeling.Sink<
Agent 
> sink;
 
  public com.anylogic.libraries.processmodeling.TimeMeasureStart<
Agent 
> timeMeasureStart;
 
  public com.anylogic.libraries.processmodeling.TimeMeasureEnd<
Agent 
> timeMeasureEnd;
 
  public com.anylogic.libraries.processmodeling.SelectOutput<
Agent 
> selectOutput;
 
  public com.anylogic.libraries.processmodeling.Service<
Agent 
> Test1;
 
  public com.anylogic.libraries.processmodeling.ResourcePool<
Agent 
> SoftwareEngineer;

  public String getNameOf( Agent ao ) {
    if ( ao == source ) return "source";
    if ( ao == Repair ) return "Repair";
    if ( ao == Technicians ) return "Technicians";
    if ( ao == TRelease ) return "TRelease";
    if ( ao == Test ) return "Test";
    if ( ao == Jig ) return "Jig";
    if ( ao == JRelease ) return "JRelease";
    if ( ao == sink ) return "sink";
    if ( ao == timeMeasureStart ) return "timeMeasureStart";
    if ( ao == timeMeasureEnd ) return "timeMeasureEnd";
    if ( ao == selectOutput ) return "selectOutput";
    if ( ao == Test1 ) return "Test1";
    if ( ao == SoftwareEngineer ) return "SoftwareEngineer";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Source<Agent> instantiate_source_xjal() {
    com.anylogic.libraries.processmodeling.Source<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Source<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code

      @AnyLogicInternalCodegenAPI
      public RateUnits getUnitsForCodeOf_rate() {
        return PER_HOUR;
      }
      @Override
      public double interarrivalTime(  ) {
        return _source_interarrivalTime_xjal( this );
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _source_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _source_arrivalDate_xjal( this );
      }
      @Override
      public int entitiesPerArrival(  ) {
        return _source_entitiesPerArrival_xjal( this );
      }
      @Override
      public double locationX( Agent agent ) {
        return _source_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Agent agent ) {
        return _source_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Agent agent ) {
        return _source_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Agent agent ) {
        return _source_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Agent agent ) {
        return _source_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Agent agent ) {
        return _source_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Agent agent ) {
        return _source_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Agent agent ) {
        return _source_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Agent agent ) {
        return _source_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Agent agent ) {
        return _source_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Agent agent ) {
        return _source_speed_xjal( this, agent );
      }
      @Override
      public Agent newEntity(  ) {
        return _source_newEntity_xjal( this );
      }
      @Override
      public boolean changeDimensions( Agent agent ) {
        return _source_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Agent agent ) {
        return _source_length_xjal( this, agent );
      }
      @Override
      public double width( Agent agent ) {
        return _source_width_xjal( this, agent );
      }
      @Override
      public double height( Agent agent ) {
        return _source_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Agent agent ) {
        return _source_population_xjal( this, agent );
      }
      @Override
      public void onBeforeArrival(  ) {
        _source_onBeforeArrival_xjal( this );
      }
      @Override
      public void onAtExit( Agent agent ) {
        _source_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Agent agent ) {
        _source_onExit_xjal( this, agent );
      }
      @Override
      public void onDiscard( Agent agent ) {
        _source_onDiscard_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_source_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, TableInput _t ) {
    self.arrivalType = 
self.RATE 
;
    self.rate = 
8 
;
    self.rate = PER_HOUR.convertTo( self.rate, PER_SECOND );
    self.firstArrivalMode = 
self.AFTER_TIMEOUT 
;
    self.firstArrivalTime = 
 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.multipleEntitiesPerArrival = 
false 
;
    self.limitArrivals = 
false 
;
    self.maxArrivals = 
1000 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.enableCustomStartTime = 
false 
;
    self.startTime = 
 
;
    self.addToCustomPopulation = 
false 
;
    self.pushProtocol = 
true 
;
    self.discardHangingEntities = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_source_xjal( com.anylogic.libraries.processmodeling.Source<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Service<Agent> instantiate_Repair_xjal() {
    com.anylogic.libraries.processmodeling.Service<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Service<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Agent agent ) {
        return _Repair_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Agent agent ) {
        return _Repair_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( Agent agent ) {
        return _Repair_resourceQuantity_xjal( this, agent );
      }
      @Override
      public double delayTime( Agent agent ) {
        return _Repair_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public boolean sendResources( Agent agent, Agent unit ) {
        return _Repair_sendResources_xjal( this, agent, unit );
      }
      @Override
      public INode destinationNode( Agent agent, Agent unit ) {
        return _Repair_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public Attractor destinationAttractor( Agent agent, Agent unit ) {
        return _Repair_destinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public boolean movingGoHome( Agent agent, Agent unit ) {
        return _Repair_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public double priority( Agent agent ) {
        return _Repair_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Agent agent ) {
        return _Repair_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( Agent agent ) {
        return _Repair_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Agent agent, Agent unit ) {
        return _Repair_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Agent agent, Agent unit ) {
        return _Repair_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Agent agent, Agent unit ) {
        return _Repair_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Agent agent, Agent unit ) {
        return _Repair_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Agent agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Repair_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Agent agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Repair_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Agent agent ) {
        return _Repair_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Agent agent ) {
        return _Repair_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public double timeout( Agent agent ) {
        return _Repair_timeout_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( Agent agent, Agent unit ) {
        return _Repair_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Agent agent ) {
        _Repair_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Agent agent ) {
        _Repair_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Agent agent ) {
        _Repair_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onSeizeUnit( Agent agent, Agent unit ) {
        _Repair_onSeizeUnit_xjal( this, agent, unit );
      }
      @Override
      public void onEnterDelay( Agent agent, double delayTime ) {
        _Repair_onEnterDelay_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Agent agent ) {
        _Repair_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Agent agent ) {
        _Repair_onExit_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Agent agent, Agent unit ) {
        _Repair_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Agent agent, Agent unit ) {
        _Repair_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Agent agent, Agent unit ) {
        _Repair_onTaskResumed_xjal( this, agent, unit );
      }
      @Override
      public void onRemove( Agent agent ) {
        _Repair_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Repair_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, TableInput _t ) {
    self.seizeFromOnePool = 
false 
;
    self.queueCapacity = 
50000 
;
    self.maximumCapacity = 
false 
;
    self.destinationType = 
self.DEST_ENTITY 
;
    self.entityLocationQueue = 
 
;
    self.entityLocationDelay = 
 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Repair_xjal( com.anylogic.libraries.processmodeling.Service<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Agent> instantiate_Technicians_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public int capacityOnValue(  ) {
        return _Technicians_capacityOnValue_xjal( this );
      }
      @Override
      public Agent newUnit(  ) {
        return _Technicians_newUnit_xjal( this );
      }
      @Override
      public double initialTimeToMaintenance( Agent unit ) {
        return _Technicians_initialTimeToMaintenance_xjal( this, unit );
      }
      @Override
      public double timeBetweenMaintenances( Agent unit ) {
        return _Technicians_timeBetweenMaintenances_xjal( this, unit );
      }
      @Override
      public double maintenanceTaskPriority( Agent unit ) {
        return _Technicians_maintenanceTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean maintenanceTaskMayPreemptOtherTasks( Agent unit ) {
        return _Technicians_maintenanceTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public double maintenanceTime( Agent unit ) {
        return _Technicians_maintenanceTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart maintenanceTaskStart( Agent unit ) {
        return _Technicians_maintenanceTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState maintenanceUsageState( Agent unit ) {
        return _Technicians_maintenanceUsageState_xjal( this, unit );
      }
      @Override
      public double initialTimeToFailure( Agent unit ) {
        return _Technicians_initialTimeToFailure_xjal( this, unit );
      }
      @Override
      public double timeBetweenFailures( Agent unit ) {
        return _Technicians_timeBetweenFailures_xjal( this, unit );
      }
      @Override
      public double repairTime( Agent unit ) {
        return _Technicians_repairTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart repairTaskStart( Agent unit ) {
        return _Technicians_repairTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState repairUsageState( Agent unit ) {
        return _Technicians_repairUsageState_xjal( this, unit );
      }
      @Override
      public double breakTaskPriority( Agent unit ) {
        return _Technicians_breakTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean breakTaskMayPreemptOtherTasks( Agent unit ) {
        return _Technicians_breakTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy breakTaskPreemptionPolicy( Agent unit ) {
        return _Technicians_breakTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState breakUsageState( Agent unit ) {
        return _Technicians_breakUsageState_xjal( this, unit );
      }
      @Override
      public double endOfShiftTaskPriority( Agent unit ) {
        return _Technicians_endOfShiftTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean endOfShiftTaskMayPreemptOtherTasks( Agent unit ) {
        return _Technicians_endOfShiftTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy endOfShiftTaskPreemptionPolicy( Agent unit ) {
        return _Technicians_endOfShiftTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public boolean requestChoiceCondition( Agent unit, Agent agent ) {
        return _Technicians_requestChoiceCondition_xjal( this, unit, agent );
      }
      @Override
      public AgentList population( Agent unit ) {
        return _Technicians_population_xjal( this, unit );
      }
      @Override
      public void onNewUnit( Agent unit ) {
        _Technicians_onNewUnit_xjal( this, unit );
      }
      @Override
      public void onDestroyUnit( Agent unit ) {
        _Technicians_onDestroyUnit_xjal( this, unit );
      }
      @Override
      public void onSeize( Agent unit, Agent agent ) {
        _Technicians_onSeize_xjal( this, unit, agent );
      }
      @Override
      public void onRelease( Agent unit, Agent agent ) {
        _Technicians_onRelease_xjal( this, unit, agent );
      }
      @Override
      public void onWrapUp( Agent unit, Agent agent ) {
        _Technicians_onWrapUp_xjal( this, unit, agent );
      }
      @Override
      public void onUnitStateChange( Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
        _Technicians_onUnitStateChange_xjal( this, unit, busy, type, agent, task );
      }
      @Override
      public void onMaintenanceStart( Agent unit ) {
        _Technicians_onMaintenanceStart_xjal( this, unit );
      }
      @Override
      public void onMaintenanceEnd( Agent unit ) {
        _Technicians_onMaintenanceEnd_xjal( this, unit );
      }
      @Override
      public void onFailure( Agent unit ) {
        _Technicians_onFailure_xjal( this, unit );
      }
      @Override
      public void onRepair( Agent unit ) {
        _Technicians_onRepair_xjal( this, unit );
      }
      @Override
      public void onBreakStart( Agent unit ) {
        _Technicians_onBreakStart_xjal( this, unit );
      }
      @Override
      public void onBreakEnd( Agent unit ) {
        _Technicians_onBreakEnd_xjal( this, unit );
      }
      @Override
      public void onBreakTerminated( Agent unit ) {
        _Technicians_onBreakTerminated_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Technicians_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
    self.type = 
self.RESOURCE_STATIC 
;
    self.capacityDefinitionType = 
self.CAPACITY_DIRECT 
;
    self.capacity = 
5 
;
    self.capacityBasedOnAttractors = 
true 
;
    self.capacitySchedule = 
 
;
    self.capacityScheduleOnOff = 
 
;
    self.shiftGroupSchedules = 
{} 
;
    self.shiftGroupSizes = 
{} 
;
    self.shiftGroupsPlan = 
 
;
    self.destroyExcessUnits = 
false 
;
    self.speed = 
10 
;
    self.homeNodes = 
{} 
;
    self.showDefaultAnimationStatic = 
true 
;
    self.downtimeSource = 
self.DOWNTIME_LIST 
;
    self.downtimeList = 
 
;
    self.enableMaintenance = 
false 
;
    self.maintenanceType = 
self.MAINTENANCE_DELAY 
;
    self.enableFailuresRepairs = 
false 
;
    self.countBusyOnlyTimeToFailure = 
false 
;
    self.repairType = 
self.REPAIR_DELAY 
;
    self.enableBreaks = 
false 
;
    self.breaksSchedule = 
 
;
    self.enableCustomTasks = 
false 
;
    self.customTasks = 
{} 
;
    self.customizeRequestChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Technicians_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<Agent> instantiate_TRelease_xjal() {
    com.anylogic.libraries.processmodeling.Release<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Agent agent ) {
        return _TRelease_resourcePool_xjal( this, agent );
      }
      @Override
      public int quantity( Agent agent ) {
        return _TRelease_quantity_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[] resources( Agent agent ) {
        return _TRelease_resources_xjal( this, agent );
      }
      @Override
      public boolean movingGoHome( Agent agent, Agent unit ) {
        return _TRelease_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Agent agent, Agent unit ) {
        return _TRelease_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Agent agent, Agent unit ) {
        return _TRelease_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public boolean wrapUpTaskMayPreemptOtherTasks( Agent agent, Agent unit ) {
        return _TRelease_wrapUpTaskMayPreemptOtherTasks_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Agent agent, Agent unit ) {
        return _TRelease_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( Agent agent, Agent unit ) {
        return _TRelease_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Agent agent ) {
        _TRelease_onEnter_xjal( this, agent );
      }
      @Override
      public void onReleaseUnit( Agent agent, Agent unit ) {
        _TRelease_onReleaseUnit_xjal( this, agent, unit );
      }
      @Override
      public void onExit( Agent agent ) {
        _TRelease_onExit_xjal( this, agent );
      }
      @Override
      public void onWrapUpTerminated( Agent unit, Agent agent ) {
        _TRelease_onWrapUpTerminated_xjal( this, unit, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_TRelease_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, TableInput _t ) {
    self.releaseMode = 
self.ALL 
;
    self.seizeBlocks = 
{} 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_TRelease_xjal( com.anylogic.libraries.processmodeling.Release<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Service<Agent> instantiate_Test_xjal() {
    com.anylogic.libraries.processmodeling.Service<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Service<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Agent agent ) {
        return _Test_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Agent agent ) {
        return _Test_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( Agent agent ) {
        return _Test_resourceQuantity_xjal( this, agent );
      }
      @Override
      public double delayTime( Agent agent ) {
        return _Test_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public boolean sendResources( Agent agent, Agent unit ) {
        return _Test_sendResources_xjal( this, agent, unit );
      }
      @Override
      public INode destinationNode( Agent agent, Agent unit ) {
        return _Test_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public Attractor destinationAttractor( Agent agent, Agent unit ) {
        return _Test_destinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public boolean movingGoHome( Agent agent, Agent unit ) {
        return _Test_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public double priority( Agent agent ) {
        return _Test_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Agent agent ) {
        return _Test_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( Agent agent ) {
        return _Test_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Agent agent, Agent unit ) {
        return _Test_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Agent agent, Agent unit ) {
        return _Test_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Agent agent, Agent unit ) {
        return _Test_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Agent agent, Agent unit ) {
        return _Test_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Agent agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Test_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Agent agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Test_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Agent agent ) {
        return _Test_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Agent agent ) {
        return _Test_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public double timeout( Agent agent ) {
        return _Test_timeout_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( Agent agent, Agent unit ) {
        return _Test_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Agent agent ) {
        _Test_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Agent agent ) {
        _Test_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Agent agent ) {
        _Test_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onSeizeUnit( Agent agent, Agent unit ) {
        _Test_onSeizeUnit_xjal( this, agent, unit );
      }
      @Override
      public void onEnterDelay( Agent agent, double delayTime ) {
        _Test_onEnterDelay_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Agent agent ) {
        _Test_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Agent agent ) {
        _Test_onExit_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Agent agent, Agent unit ) {
        _Test_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Agent agent, Agent unit ) {
        _Test_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Agent agent, Agent unit ) {
        _Test_onTaskResumed_xjal( this, agent, unit );
      }
      @Override
      public void onRemove( Agent agent ) {
        _Test_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Test_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, TableInput _t ) {
    self.seizeFromOnePool = 
false 
;
    self.queueCapacity = 
50000 
;
    self.maximumCapacity = 
false 
;
    self.destinationType = 
self.DEST_ENTITY 
;
    self.entityLocationQueue = 
 
;
    self.entityLocationDelay = 
 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Test_xjal( com.anylogic.libraries.processmodeling.Service<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Agent> instantiate_Jig_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public int capacityOnValue(  ) {
        return _Jig_capacityOnValue_xjal( this );
      }
      @Override
      public Agent newUnit(  ) {
        return _Jig_newUnit_xjal( this );
      }
      @Override
      public double initialTimeToMaintenance( Agent unit ) {
        return _Jig_initialTimeToMaintenance_xjal( this, unit );
      }
      @Override
      public double timeBetweenMaintenances( Agent unit ) {
        return _Jig_timeBetweenMaintenances_xjal( this, unit );
      }
      @Override
      public double maintenanceTaskPriority( Agent unit ) {
        return _Jig_maintenanceTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean maintenanceTaskMayPreemptOtherTasks( Agent unit ) {
        return _Jig_maintenanceTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public double maintenanceTime( Agent unit ) {
        return _Jig_maintenanceTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart maintenanceTaskStart( Agent unit ) {
        return _Jig_maintenanceTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState maintenanceUsageState( Agent unit ) {
        return _Jig_maintenanceUsageState_xjal( this, unit );
      }
      @Override
      public double initialTimeToFailure( Agent unit ) {
        return _Jig_initialTimeToFailure_xjal( this, unit );
      }
      @Override
      public double timeBetweenFailures( Agent unit ) {
        return _Jig_timeBetweenFailures_xjal( this, unit );
      }
      @Override
      public double repairTime( Agent unit ) {
        return _Jig_repairTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart repairTaskStart( Agent unit ) {
        return _Jig_repairTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState repairUsageState( Agent unit ) {
        return _Jig_repairUsageState_xjal( this, unit );
      }
      @Override
      public double breakTaskPriority( Agent unit ) {
        return _Jig_breakTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean breakTaskMayPreemptOtherTasks( Agent unit ) {
        return _Jig_breakTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy breakTaskPreemptionPolicy( Agent unit ) {
        return _Jig_breakTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState breakUsageState( Agent unit ) {
        return _Jig_breakUsageState_xjal( this, unit );
      }
      @Override
      public double endOfShiftTaskPriority( Agent unit ) {
        return _Jig_endOfShiftTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean endOfShiftTaskMayPreemptOtherTasks( Agent unit ) {
        return _Jig_endOfShiftTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy endOfShiftTaskPreemptionPolicy( Agent unit ) {
        return _Jig_endOfShiftTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public boolean requestChoiceCondition( Agent unit, Agent agent ) {
        return _Jig_requestChoiceCondition_xjal( this, unit, agent );
      }
      @Override
      public AgentList population( Agent unit ) {
        return _Jig_population_xjal( this, unit );
      }
      @Override
      public void onNewUnit( Agent unit ) {
        _Jig_onNewUnit_xjal( this, unit );
      }
      @Override
      public void onDestroyUnit( Agent unit ) {
        _Jig_onDestroyUnit_xjal( this, unit );
      }
      @Override
      public void onSeize( Agent unit, Agent agent ) {
        _Jig_onSeize_xjal( this, unit, agent );
      }
      @Override
      public void onRelease( Agent unit, Agent agent ) {
        _Jig_onRelease_xjal( this, unit, agent );
      }
      @Override
      public void onWrapUp( Agent unit, Agent agent ) {
        _Jig_onWrapUp_xjal( this, unit, agent );
      }
      @Override
      public void onUnitStateChange( Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
        _Jig_onUnitStateChange_xjal( this, unit, busy, type, agent, task );
      }
      @Override
      public void onMaintenanceStart( Agent unit ) {
        _Jig_onMaintenanceStart_xjal( this, unit );
      }
      @Override
      public void onMaintenanceEnd( Agent unit ) {
        _Jig_onMaintenanceEnd_xjal( this, unit );
      }
      @Override
      public void onFailure( Agent unit ) {
        _Jig_onFailure_xjal( this, unit );
      }
      @Override
      public void onRepair( Agent unit ) {
        _Jig_onRepair_xjal( this, unit );
      }
      @Override
      public void onBreakStart( Agent unit ) {
        _Jig_onBreakStart_xjal( this, unit );
      }
      @Override
      public void onBreakEnd( Agent unit ) {
        _Jig_onBreakEnd_xjal( this, unit );
      }
      @Override
      public void onBreakTerminated( Agent unit ) {
        _Jig_onBreakTerminated_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Jig_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
    self.type = 
self.RESOURCE_STATIC 
;
    self.capacityDefinitionType = 
self.CAPACITY_DIRECT 
;
    self.capacity = 
3 
;
    self.capacityBasedOnAttractors = 
true 
;
    self.capacitySchedule = 
 
;
    self.capacityScheduleOnOff = 
 
;
    self.shiftGroupSchedules = 
{} 
;
    self.shiftGroupSizes = 
{} 
;
    self.shiftGroupsPlan = 
 
;
    self.destroyExcessUnits = 
false 
;
    self.speed = 
10 
;
    self.homeNodes = 
{} 
;
    self.showDefaultAnimationStatic = 
true 
;
    self.downtimeSource = 
self.DOWNTIME_LIST 
;
    self.downtimeList = 
 
;
    self.enableMaintenance = 
false 
;
    self.maintenanceType = 
self.MAINTENANCE_DELAY 
;
    self.enableFailuresRepairs = 
false 
;
    self.countBusyOnlyTimeToFailure = 
false 
;
    self.repairType = 
self.REPAIR_DELAY 
;
    self.enableBreaks = 
false 
;
    self.breaksSchedule = 
 
;
    self.enableCustomTasks = 
false 
;
    self.customTasks = 
{} 
;
    self.customizeRequestChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Jig_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<Agent> instantiate_JRelease_xjal() {
    com.anylogic.libraries.processmodeling.Release<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Agent agent ) {
        return _JRelease_resourcePool_xjal( this, agent );
      }
      @Override
      public int quantity( Agent agent ) {
        return _JRelease_quantity_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[] resources( Agent agent ) {
        return _JRelease_resources_xjal( this, agent );
      }
      @Override
      public boolean movingGoHome( Agent agent, Agent unit ) {
        return _JRelease_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Agent agent, Agent unit ) {
        return _JRelease_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Agent agent, Agent unit ) {
        return _JRelease_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public boolean wrapUpTaskMayPreemptOtherTasks( Agent agent, Agent unit ) {
        return _JRelease_wrapUpTaskMayPreemptOtherTasks_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Agent agent, Agent unit ) {
        return _JRelease_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( Agent agent, Agent unit ) {
        return _JRelease_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Agent agent ) {
        _JRelease_onEnter_xjal( this, agent );
      }
      @Override
      public void onReleaseUnit( Agent agent, Agent unit ) {
        _JRelease_onReleaseUnit_xjal( this, agent, unit );
      }
      @Override
      public void onExit( Agent agent ) {
        _JRelease_onExit_xjal( this, agent );
      }
      @Override
      public void onWrapUpTerminated( Agent unit, Agent agent ) {
        _JRelease_onWrapUpTerminated_xjal( this, unit, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_JRelease_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, TableInput _t ) {
    self.releaseMode = 
self.ALL 
;
    self.seizeBlocks = 
{} 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_JRelease_xjal( com.anylogic.libraries.processmodeling.Release<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Agent> instantiate_sink_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Agent agent ) {
        _sink_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sink_xjal( final com.anylogic.libraries.processmodeling.Sink<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink_xjal( com.anylogic.libraries.processmodeling.Sink<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.TimeMeasureStart<Agent> instantiate_timeMeasureStart_xjal() {
    com.anylogic.libraries.processmodeling.TimeMeasureStart<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.TimeMeasureStart<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Agent agent ) {
        _timeMeasureStart_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_timeMeasureStart_xjal( final com.anylogic.libraries.processmodeling.TimeMeasureStart<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_timeMeasureStart_xjal( com.anylogic.libraries.processmodeling.TimeMeasureStart<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.TimeMeasureEnd<Agent> instantiate_timeMeasureEnd_xjal() {
    com.anylogic.libraries.processmodeling.TimeMeasureEnd<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.TimeMeasureEnd<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Agent agent ) {
        _timeMeasureEnd_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_timeMeasureEnd_xjal( final com.anylogic.libraries.processmodeling.TimeMeasureEnd<Agent> self, TableInput _t ) {
    self.startObjects = new com.anylogic.libraries.processmodeling.TimeMeasureStart[]
{ timeMeasureStart } 
;
    self.datasetCapacity = 
100 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_timeMeasureEnd_xjal( com.anylogic.libraries.processmodeling.TimeMeasureEnd<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Agent> instantiate_selectOutput_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Agent agent ) {
        return _selectOutput_condition_xjal( this, agent );
      }
      @Override
      public double probability( Agent agent ) {
        return _selectOutput_probability_xjal( this, agent );
      }
      @Override
      public void onEnter( Agent agent ) {
        _selectOutput_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTrue( Agent agent ) {
        _selectOutput_onExitTrue_xjal( this, agent );
      }
      @Override
      public void onExitFalse( Agent agent ) {
        _selectOutput_onExitFalse_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_selectOutput_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Agent> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_selectOutput_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Service<Agent> instantiate_Test1_xjal() {
    com.anylogic.libraries.processmodeling.Service<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Service<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Agent agent ) {
        return _Test1_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Agent agent ) {
        return _Test1_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( Agent agent ) {
        return _Test1_resourceQuantity_xjal( this, agent );
      }
      @Override
      public double delayTime( Agent agent ) {
        return _Test1_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public boolean sendResources( Agent agent, Agent unit ) {
        return _Test1_sendResources_xjal( this, agent, unit );
      }
      @Override
      public INode destinationNode( Agent agent, Agent unit ) {
        return _Test1_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public Attractor destinationAttractor( Agent agent, Agent unit ) {
        return _Test1_destinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public boolean movingGoHome( Agent agent, Agent unit ) {
        return _Test1_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public double priority( Agent agent ) {
        return _Test1_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Agent agent ) {
        return _Test1_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( Agent agent ) {
        return _Test1_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Agent agent, Agent unit ) {
        return _Test1_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Agent agent, Agent unit ) {
        return _Test1_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Agent agent, Agent unit ) {
        return _Test1_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Agent agent, Agent unit ) {
        return _Test1_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Agent agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Test1_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Agent agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Test1_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Agent agent ) {
        return _Test1_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Agent agent ) {
        return _Test1_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public double timeout( Agent agent ) {
        return _Test1_timeout_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( Agent agent, Agent unit ) {
        return _Test1_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Agent agent ) {
        _Test1_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Agent agent ) {
        _Test1_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Agent agent ) {
        _Test1_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onSeizeUnit( Agent agent, Agent unit ) {
        _Test1_onSeizeUnit_xjal( this, agent, unit );
      }
      @Override
      public void onEnterDelay( Agent agent, double delayTime ) {
        _Test1_onEnterDelay_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Agent agent ) {
        _Test1_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Agent agent ) {
        _Test1_onExit_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Agent agent, Agent unit ) {
        _Test1_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Agent agent, Agent unit ) {
        _Test1_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Agent agent, Agent unit ) {
        _Test1_onTaskResumed_xjal( this, agent, unit );
      }
      @Override
      public void onRemove( Agent agent ) {
        _Test1_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Test1_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, TableInput _t ) {
    self.seizeFromOnePool = 
false 
;
    self.queueCapacity = 
50000 
;
    self.maximumCapacity = 
false 
;
    self.destinationType = 
self.DEST_ENTITY 
;
    self.entityLocationQueue = 
 
;
    self.entityLocationDelay = 
 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Test1_xjal( com.anylogic.libraries.processmodeling.Service<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Agent> instantiate_SoftwareEngineer_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public int capacityOnValue(  ) {
        return _SoftwareEngineer_capacityOnValue_xjal( this );
      }
      @Override
      public Agent newUnit(  ) {
        return _SoftwareEngineer_newUnit_xjal( this );
      }
      @Override
      public double initialTimeToMaintenance( Agent unit ) {
        return _SoftwareEngineer_initialTimeToMaintenance_xjal( this, unit );
      }
      @Override
      public double timeBetweenMaintenances( Agent unit ) {
        return _SoftwareEngineer_timeBetweenMaintenances_xjal( this, unit );
      }
      @Override
      public double maintenanceTaskPriority( Agent unit ) {
        return _SoftwareEngineer_maintenanceTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean maintenanceTaskMayPreemptOtherTasks( Agent unit ) {
        return _SoftwareEngineer_maintenanceTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public double maintenanceTime( Agent unit ) {
        return _SoftwareEngineer_maintenanceTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart maintenanceTaskStart( Agent unit ) {
        return _SoftwareEngineer_maintenanceTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState maintenanceUsageState( Agent unit ) {
        return _SoftwareEngineer_maintenanceUsageState_xjal( this, unit );
      }
      @Override
      public double initialTimeToFailure( Agent unit ) {
        return _SoftwareEngineer_initialTimeToFailure_xjal( this, unit );
      }
      @Override
      public double timeBetweenFailures( Agent unit ) {
        return _SoftwareEngineer_timeBetweenFailures_xjal( this, unit );
      }
      @Override
      public double repairTime( Agent unit ) {
        return _SoftwareEngineer_repairTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart repairTaskStart( Agent unit ) {
        return _SoftwareEngineer_repairTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState repairUsageState( Agent unit ) {
        return _SoftwareEngineer_repairUsageState_xjal( this, unit );
      }
      @Override
      public double breakTaskPriority( Agent unit ) {
        return _SoftwareEngineer_breakTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean breakTaskMayPreemptOtherTasks( Agent unit ) {
        return _SoftwareEngineer_breakTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy breakTaskPreemptionPolicy( Agent unit ) {
        return _SoftwareEngineer_breakTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState breakUsageState( Agent unit ) {
        return _SoftwareEngineer_breakUsageState_xjal( this, unit );
      }
      @Override
      public double endOfShiftTaskPriority( Agent unit ) {
        return _SoftwareEngineer_endOfShiftTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean endOfShiftTaskMayPreemptOtherTasks( Agent unit ) {
        return _SoftwareEngineer_endOfShiftTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy endOfShiftTaskPreemptionPolicy( Agent unit ) {
        return _SoftwareEngineer_endOfShiftTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public boolean requestChoiceCondition( Agent unit, Agent agent ) {
        return _SoftwareEngineer_requestChoiceCondition_xjal( this, unit, agent );
      }
      @Override
      public AgentList population( Agent unit ) {
        return _SoftwareEngineer_population_xjal( this, unit );
      }
      @Override
      public void onNewUnit( Agent unit ) {
        _SoftwareEngineer_onNewUnit_xjal( this, unit );
      }
      @Override
      public void onDestroyUnit( Agent unit ) {
        _SoftwareEngineer_onDestroyUnit_xjal( this, unit );
      }
      @Override
      public void onSeize( Agent unit, Agent agent ) {
        _SoftwareEngineer_onSeize_xjal( this, unit, agent );
      }
      @Override
      public void onRelease( Agent unit, Agent agent ) {
        _SoftwareEngineer_onRelease_xjal( this, unit, agent );
      }
      @Override
      public void onWrapUp( Agent unit, Agent agent ) {
        _SoftwareEngineer_onWrapUp_xjal( this, unit, agent );
      }
      @Override
      public void onUnitStateChange( Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
        _SoftwareEngineer_onUnitStateChange_xjal( this, unit, busy, type, agent, task );
      }
      @Override
      public void onMaintenanceStart( Agent unit ) {
        _SoftwareEngineer_onMaintenanceStart_xjal( this, unit );
      }
      @Override
      public void onMaintenanceEnd( Agent unit ) {
        _SoftwareEngineer_onMaintenanceEnd_xjal( this, unit );
      }
      @Override
      public void onFailure( Agent unit ) {
        _SoftwareEngineer_onFailure_xjal( this, unit );
      }
      @Override
      public void onRepair( Agent unit ) {
        _SoftwareEngineer_onRepair_xjal( this, unit );
      }
      @Override
      public void onBreakStart( Agent unit ) {
        _SoftwareEngineer_onBreakStart_xjal( this, unit );
      }
      @Override
      public void onBreakEnd( Agent unit ) {
        _SoftwareEngineer_onBreakEnd_xjal( this, unit );
      }
      @Override
      public void onBreakTerminated( Agent unit ) {
        _SoftwareEngineer_onBreakTerminated_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_SoftwareEngineer_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
    self.type = 
self.RESOURCE_STATIC 
;
    self.capacityDefinitionType = 
self.CAPACITY_DIRECT 
;
    self.capacity = 
1 
;
    self.capacityBasedOnAttractors = 
true 
;
    self.capacitySchedule = 
 
;
    self.capacityScheduleOnOff = 
 
;
    self.shiftGroupSchedules = 
{} 
;
    self.shiftGroupSizes = 
{} 
;
    self.shiftGroupsPlan = 
 
;
    self.destroyExcessUnits = 
false 
;
    self.speed = 
10 
;
    self.homeNodes = 
{} 
;
    self.showDefaultAnimationStatic = 
true 
;
    self.downtimeSource = 
self.DOWNTIME_LIST 
;
    self.downtimeList = 
 
;
    self.enableMaintenance = 
false 
;
    self.maintenanceType = 
self.MAINTENANCE_DELAY 
;
    self.enableFailuresRepairs = 
false 
;
    self.countBusyOnlyTimeToFailure = 
false 
;
    self.repairType = 
self.REPAIR_DELAY 
;
    self.enableBreaks = 
false 
;
    self.breaksSchedule = 
 
;
    self.enableCustomTasks = 
false 
;
    self.customTasks = 
{} 
;
    self.customizeRequestChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_SoftwareEngineer_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }

  private double _source_interarrivalTime_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self ) {
    double _value;
    _value = 
exponential( 1 ) 
;
    return _value;
  }
  private double _source_rateExpression_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _source_arrivalDate_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private int _source_entitiesPerArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self ) {
    int _value;
    _value = 
uniform_discr(3, 5) 
;
    return _value;
  }
  private double _source_locationX_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationY_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationZ_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _source_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _source_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _source_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _source_locationNode_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _source_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _source_speed_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private Agent _source_newEntity_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private boolean _source_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _source_length_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _source_width_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _source_height_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _source_population_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _source_onBeforeArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self ) {
    
 
;
  }
  private void _source_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    
 
;
  }
  private void _source_onExit_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    
 
;
  }
  private void _source_onDiscard_xjal( final com.anylogic.libraries.processmodeling.Source<Agent> self, Agent agent ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _Repair_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = new com.anylogic.libraries.processmodeling.ResourcePool[][]
{ 
  { Technicians }
} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _Repair_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _Repair_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private double _Repair_delayTime_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
triangular(10, 15, 60 ) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private boolean _Repair_sendResources_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INode _Repair_destinationNode_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _Repair_destinationAttractor_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private boolean _Repair_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _Repair_priority_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Repair_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.engine.TaskPreemptionPolicy _Repair_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.engine.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _Repair_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _Repair_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _Repair_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _Repair_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.WPP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _Repair_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _Repair_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _Repair_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent unit, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Repair_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent unit1, Agent unit2, Agent agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _Repair_timeout_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Repair_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _Repair_onEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Repair_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Repair_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Repair_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Repair_onEnterDelay_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, double delayTime ) {
    
 
;
  }
  private void _Repair_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Repair_onExit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Repair_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Repair_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Repair_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Repair_onRemove_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private int _Technicians_capacityOnValue_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private Agent _Technicians_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private double _Technicians_initialTimeToMaintenance_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _Technicians_timeBetweenMaintenances_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _Technicians_maintenanceTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _Technicians_maintenanceTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _Technicians_maintenanceTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangular(10, 20, 30) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _Technicians_maintenanceTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Technicians_maintenanceUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _Technicians_initialTimeToFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _Technicians_timeBetweenFailures_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _Technicians_repairTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 10, 0.1 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _Technicians_repairTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Technicians_repairUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _Technicians_breakTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
50 
;
    return _value;
  }
  private boolean _Technicians_breakTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _Technicians_breakTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_TERMINATE 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Technicians_breakUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _Technicians_endOfShiftTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _Technicians_endOfShiftTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _Technicians_endOfShiftTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _Technicians_requestChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private AgentList _Technicians_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _Technicians_onNewUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onDestroyUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onSeize_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _Technicians_onRelease_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _Technicians_onWrapUp_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _Technicians_onUnitStateChange_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
    
 
;
  }
  private void _Technicians_onMaintenanceStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onMaintenanceEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onRepair_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onBreakStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onBreakEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Technicians_onBreakTerminated_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _TRelease_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _TRelease_quantity_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[] _TRelease_resources_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[] _value;
    _value = 
{} 
;
    return _value;
  }
  private boolean _TRelease_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _TRelease_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _TRelease_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _TRelease_wrapUpTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _TRelease_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _TRelease_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _TRelease_onEnter_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    
 
;
  }
  private void _TRelease_onReleaseUnit_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _TRelease_onExit_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    
 
;
  }
  private void _TRelease_onWrapUpTerminated_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _Test_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = new com.anylogic.libraries.processmodeling.ResourcePool[][]
{ 
  { Jig }
} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _Test_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _Test_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private double _Test_delayTime_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
20 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private boolean _Test_sendResources_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INode _Test_destinationNode_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _Test_destinationAttractor_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private boolean _Test_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _Test_priority_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Test_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.engine.TaskPreemptionPolicy _Test_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.engine.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _Test_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _Test_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _Test_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _Test_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.WPP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _Test_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _Test_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _Test_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent unit, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Test_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent unit1, Agent unit2, Agent agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _Test_timeout_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Test_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _Test_onEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test_onEnterDelay_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, double delayTime ) {
    
 
;
  }
  private void _Test_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test_onExit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test_onRemove_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private int _Jig_capacityOnValue_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private Agent _Jig_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private double _Jig_initialTimeToMaintenance_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _Jig_timeBetweenMaintenances_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _Jig_maintenanceTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _Jig_maintenanceTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _Jig_maintenanceTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangular(10, 20, 30) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _Jig_maintenanceTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Jig_maintenanceUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _Jig_initialTimeToFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _Jig_timeBetweenFailures_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _Jig_repairTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 10, 0.1 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _Jig_repairTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Jig_repairUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _Jig_breakTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
50 
;
    return _value;
  }
  private boolean _Jig_breakTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _Jig_breakTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_TERMINATE 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Jig_breakUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _Jig_endOfShiftTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _Jig_endOfShiftTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _Jig_endOfShiftTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _Jig_requestChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private AgentList _Jig_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _Jig_onNewUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onDestroyUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onSeize_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _Jig_onRelease_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _Jig_onWrapUp_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _Jig_onUnitStateChange_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
    
 
;
  }
  private void _Jig_onMaintenanceStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onMaintenanceEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onRepair_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onBreakStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onBreakEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _Jig_onBreakTerminated_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _JRelease_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _JRelease_quantity_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[] _JRelease_resources_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[] _value;
    _value = 
{} 
;
    return _value;
  }
  private boolean _JRelease_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _JRelease_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _JRelease_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _JRelease_wrapUpTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _JRelease_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _JRelease_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _JRelease_onEnter_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    
 
;
  }
  private void _JRelease_onReleaseUnit_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _JRelease_onExit_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent agent ) {
    
 
;
  }
  private void _JRelease_onWrapUpTerminated_xjal( final com.anylogic.libraries.processmodeling.Release<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _sink_onEnter_xjal( final com.anylogic.libraries.processmodeling.Sink<Agent> self, Agent agent ) {
    
 
;
  }
  private void _timeMeasureStart_onEnter_xjal( final com.anylogic.libraries.processmodeling.TimeMeasureStart<Agent> self, Agent agent ) {
    
 
;
  }
  private void _timeMeasureEnd_onEnter_xjal( final com.anylogic.libraries.processmodeling.TimeMeasureEnd<Agent> self, Agent agent ) {
    
 
;
  }
  private boolean _selectOutput_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
randomTrue( 0.5 ) 
;
    return _value;
  }
  private double _selectOutput_probability_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Agent> self, Agent agent ) {
    double _value;
    _value = 
0.2 
;
    return _value;
  }
  private void _selectOutput_onEnter_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Agent> self, Agent agent ) {
    
 
;
  }
  private void _selectOutput_onExitTrue_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Agent> self, Agent agent ) {
    
 
;
  }
  private void _selectOutput_onExitFalse_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Agent> self, Agent agent ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _Test1_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = new com.anylogic.libraries.processmodeling.ResourcePool[][]
{ 
  { SoftwareEngineer }
} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _Test1_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _Test1_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private double _Test1_delayTime_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
triangular(5,10,35) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private boolean _Test1_sendResources_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INode _Test1_destinationNode_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _Test1_destinationAttractor_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private boolean _Test1_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _Test1_priority_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Test1_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.engine.TaskPreemptionPolicy _Test1_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    com.anylogic.engine.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _Test1_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _Test1_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _Test1_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _Test1_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.WPP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _Test1_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _Test1_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _Test1_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent unit, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Test1_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent unit1, Agent unit2, Agent agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _Test1_timeout_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _Test1_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _Test1_onEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test1_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test1_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test1_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test1_onEnterDelay_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, double delayTime ) {
    
 
;
  }
  private void _Test1_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test1_onExit_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private void _Test1_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test1_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test1_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent, Agent unit ) {
    
 
;
  }
  private void _Test1_onRemove_xjal( final com.anylogic.libraries.processmodeling.Service<Agent> self, Agent agent ) {
    
 
;
  }
  private int _SoftwareEngineer_capacityOnValue_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private Agent _SoftwareEngineer_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private double _SoftwareEngineer_initialTimeToMaintenance_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _SoftwareEngineer_timeBetweenMaintenances_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _SoftwareEngineer_maintenanceTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _SoftwareEngineer_maintenanceTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _SoftwareEngineer_maintenanceTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangular(10, 20, 30) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _SoftwareEngineer_maintenanceTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _SoftwareEngineer_maintenanceUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _SoftwareEngineer_initialTimeToFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _SoftwareEngineer_timeBetweenFailures_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _SoftwareEngineer_repairTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 10, 0.1 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _SoftwareEngineer_repairTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _SoftwareEngineer_repairUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _SoftwareEngineer_breakTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
50 
;
    return _value;
  }
  private boolean _SoftwareEngineer_breakTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _SoftwareEngineer_breakTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_TERMINATE 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _SoftwareEngineer_breakUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _SoftwareEngineer_endOfShiftTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _SoftwareEngineer_endOfShiftTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _SoftwareEngineer_endOfShiftTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _SoftwareEngineer_requestChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private AgentList _SoftwareEngineer_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _SoftwareEngineer_onNewUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onDestroyUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onSeize_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _SoftwareEngineer_onRelease_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _SoftwareEngineer_onWrapUp_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _SoftwareEngineer_onUnitStateChange_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
    
 
;
  }
  private void _SoftwareEngineer_onMaintenanceStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onMaintenanceEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onRepair_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onBreakStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onBreakEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _SoftwareEngineer_onBreakTerminated_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1000.0, 600.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 1;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return false;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll();
  }

  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
  }

  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
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
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    source = instantiate_source_xjal();
    Repair = instantiate_Repair_xjal();
    Technicians = instantiate_Technicians_xjal();
    TRelease = instantiate_TRelease_xjal();
    Test = instantiate_Test_xjal();
    Jig = instantiate_Jig_xjal();
    JRelease = instantiate_JRelease_xjal();
    sink = instantiate_sink_xjal();
    timeMeasureStart = instantiate_timeMeasureStart_xjal();
    timeMeasureEnd = instantiate_timeMeasureEnd_xjal();
    selectOutput = instantiate_selectOutput_xjal();
    Test1 = instantiate_Test1_xjal();
    SoftwareEngineer = instantiate_SoftwareEngineer_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "gradedproblem2part1.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Creating non-replicated embedded objects
    setupParameters_source_xjal( source, null );
    doBeforeCreate_source_xjal( source, null );
    source.createAsEmbedded();
    setupParameters_Repair_xjal( Repair, null );
    doBeforeCreate_Repair_xjal( Repair, null );
    Repair.createAsEmbedded();
    setupParameters_Technicians_xjal( Technicians, null );
    doBeforeCreate_Technicians_xjal( Technicians, null );
    Technicians.createAsEmbedded();
    setupParameters_TRelease_xjal( TRelease, null );
    doBeforeCreate_TRelease_xjal( TRelease, null );
    TRelease.createAsEmbedded();
    setupParameters_Test_xjal( Test, null );
    doBeforeCreate_Test_xjal( Test, null );
    Test.createAsEmbedded();
    setupParameters_Jig_xjal( Jig, null );
    doBeforeCreate_Jig_xjal( Jig, null );
    Jig.createAsEmbedded();
    setupParameters_JRelease_xjal( JRelease, null );
    doBeforeCreate_JRelease_xjal( JRelease, null );
    JRelease.createAsEmbedded();
    setupParameters_sink_xjal( sink, null );
    doBeforeCreate_sink_xjal( sink, null );
    sink.createAsEmbedded();
    setupParameters_timeMeasureStart_xjal( timeMeasureStart, null );
    doBeforeCreate_timeMeasureStart_xjal( timeMeasureStart, null );
    timeMeasureStart.createAsEmbedded();
    setupParameters_timeMeasureEnd_xjal( timeMeasureEnd, null );
    doBeforeCreate_timeMeasureEnd_xjal( timeMeasureEnd, null );
    timeMeasureEnd.createAsEmbedded();
    setupParameters_selectOutput_xjal( selectOutput, null );
    doBeforeCreate_selectOutput_xjal( selectOutput, null );
    selectOutput.createAsEmbedded();
    setupParameters_Test1_xjal( Test1, null );
    doBeforeCreate_Test1_xjal( Test1, null );
    Test1.createAsEmbedded();
    setupParameters_SoftwareEngineer_xjal( SoftwareEngineer, null );
    doBeforeCreate_SoftwareEngineer_xjal( SoftwareEngineer, null );
    SoftwareEngineer.createAsEmbedded();
	 // Port connectors with non-replicated objects
    TRelease.in.connect( Repair.out ); // connector1
    Test.in.connect( TRelease.out ); // connector2
    JRelease.in.connect( Test.out ); // connector3
    Repair.in.connect( timeMeasureStart.out ); // connector
    timeMeasureStart.in.connect( source.out ); // connector5
    sink.in.connect( timeMeasureEnd.out ); // connector4
    timeMeasureEnd.in.connect( selectOutput.outT ); // connector6
    selectOutput.in.connect( JRelease.out ); // connector7
    selectOutput.outF.connect( Test1.in ); // connector8
    Test1.out.connect( Test.in ); // connector9
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
1 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
1 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
1 
;
	  _e.setHeight( _height, METER );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics && tryExt(ExtAgentWithSpatialMetrics.class) == null ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    source.startAsEmbedded();
    Repair.startAsEmbedded();
    Technicians.startAsEmbedded();
    TRelease.startAsEmbedded();
    Test.startAsEmbedded();
    Jig.startAsEmbedded();
    JRelease.startAsEmbedded();
    sink.startAsEmbedded();
    timeMeasureStart.startAsEmbedded();
    timeMeasureEnd.startAsEmbedded();
    selectOutput.startAsEmbedded();
    Test1.startAsEmbedded();
    SoftwareEngineer.startAsEmbedded();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<>();
    }
    list.add( source );
    list.add( Repair );
    list.add( Technicians );
    list.add( TRelease );
    list.add( Test );
    list.add( Jig );
    list.add( JRelease );
    list.add( sink );
    list.add( timeMeasureStart );
    list.add( timeMeasureEnd );
    list.add( selectOutput );
    list.add( Test1 );
    list.add( SoftwareEngineer );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    source.onDestroy();
    Repair.onDestroy();
    Technicians.onDestroy();
    TRelease.onDestroy();
    Test.onDestroy();
    Jig.onDestroy();
    JRelease.onDestroy();
    sink.onDestroy();
    timeMeasureStart.onDestroy();
    timeMeasureEnd.onDestroy();
    selectOutput.onDestroy();
    Test1.onDestroy();
    SoftwareEngineer.onDestroy();
    // On destroy code
    
 
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    source.doFinish();
    Repair.doFinish();
    Technicians.doFinish();
    TRelease.doFinish();
    Test.doFinish();
    Jig.doFinish();
    JRelease.doFinish();
    sink.doFinish();
    timeMeasureStart.doFinish();
    timeMeasureEnd.doFinish();
    selectOutput.doFinish();
    Test1.doFinish();
    SoftwareEngineer.doFinish();
  }

  // Additional class code

 
  // End of additional class code

}
