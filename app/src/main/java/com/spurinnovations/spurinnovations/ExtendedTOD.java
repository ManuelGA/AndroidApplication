package com.spurinnovations.spurinnovations;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Manuel on 2015-05-11.
 */
public enum ExtendedTOD implements TODint
{
    PIDS_SUPPORTED_1_20(0),
    MONITOR_DTC(1),
    FREEZE_DTC(2),
    FUEL_SYSTEM_STATUS(3),
    ENGINE_LOAD(4),
    COOLANT_TEMPERATURE(5),
    SHORT_TERM_FUEL_B1(6),
    LONG_TERM_FUEL_B1(7),
    SHORT_TERM_FUEL_B2(8),
    LONG_TERM_FUEL_B2(9),
    FUEL_PRESSURE(10),
    MANIFOLD_PRESSURE(11),
    ENGINE_RPM(12),
    VEHICLE_SPEED(13),
    TIMING_ADVANCE(14),
    AIR_TEMPERATURE(15),
    MAF_AIRFLOW(16),
    THROTTLE_POSITION(17),
    SECONDARY_AIR_STATUS(18),
    OXYGEN_SENSORS(19),
    B1_S1_OXYGEN_SENSOR_VOLTAGE_FUEL(20),
    B1_S2_OXYGEN_SENSOR_VOLTAGE_FUEL(21),
    B1_S3_OXYGEN_SENSOR_VOLTAGE_FUEL(22),
    B1_S4_OXYGEN_SENSOR_VOLTAGE_FUEL(23),
    B2_S1_OXYGEN_SENSOR_VOLTAGE_FUEL(24),
    B2_S2_OXYGEN_SENSOR_VOLTAGE_FUEL(25),
    B2_S3_OXYGEN_SENSOR_VOLTAGE_FUEL(26),
    B2_S4_OXYGEN_SENSOR_VOLTAGE_FUEL(27),
    OBD_STANDARD(28),
    OXYGEN_SENSORS_SECOND(29),
    AUX_INPUT_STATUS(30),
    RUNTIME_ENGINE(31),
    PIDS_SUPPORTED_21_40(32),
    DISTANCE_MIL_ON(33),
    FUEL_RAIL_PRESSURE_VACUUM(34),
    FUEL_RAIL_PRESSURE_INJECTION(35),
    O2S1_WR_LAMBDA_RATIO_VOLTAGE(36),
    O2S2_WR_LAMBDA_RATIO_VOLTAGE(37),
    O2S3_WR_LAMBDA_RATIO_VOLTAGE(38),
    O2S4_WR_LAMBDA_RATIO_VOLTAGE(39),
    O2S5_WR_LAMBDA_RATIO_VOLTAGE(40),
    O2S6_WR_LAMBDA_RATIO_VOLTAGE(41),
    O2S7_WR_LAMBDA_RATIO_VOLTAGE(42),
    O2S8_WR_LAMBDA_RATIO_VOLTAGE(43),
    COMMANDED_EGR(44),
    EGR_ERROR(45),
    COMMANDED_EVA_PURGE(46),
    FUEL_LEVEL_INPUT(47),
    NUMBER_WARMUPS(48),
    DISTANCE_TRAVELED(49),
    EV_VAPOR_PRESSURE(50),
    BAROMETRIC_PRESSURE(51),
    O2S1_WR_LAMBDA_RATIO_CURRENT(52),
    O2S2_WR_LAMBDA_RATIO_CURRENT(53),
    O2S3_WR_LAMBDA_RATIO_CURRENT(54),
    O2S4_WR_LAMBDA_RATIO_CURRENT(55),
    O2S5_WR_LAMBDA_RATIO_CURRENT(56),
    O2S6_WR_LAMBDA_RATIO_CURRENT(57),
    O2S7_WR_LAMBDA_RATIO_CURRENT(58),
    O2S8_WR_LAMBDA_RATIO_CURRENT(59),
    CATALYST_TEMP_B1S1(60),
    CATALYST_TEMP_B2S1(61),
    CATALYST_TEMP_B1S2(62),
    CATALYST_TEMP_B2S2(63),
    PIDS_SUPPORTED_41_60(64),
    MONITOR_STATUS(65),
    CONTROL_MODULE_VOLTAGE(66),
    ABSOLUTE_LOAD_VALUE(67),
    FUEL_AIR_RATIO(68),
    RELATIVE_THROTTLE_POSITION(69),
    AMBIENT_AIR_PRESSURE(70),
    ABSOLUTE_THROTTLE_POSITION_B(71),
    ABSOLUTE_THROTTLE_POSITION_C(72),
    ACC_PEDAL_POSITION_D(73),
    ACC_PEDAL_POSITION_E(74),
    ACC_PEDAL_POSITION_F(75),
    COMMANDED_THROTTLE_ACTUATOR(76),
    TIME_MIL_ON(77),
    TIME_TROUBLE_CODES_CLEAR(78),
    MAXVAL_EQRATIO_OSVOLTAGE_OSCURRENT_IMPRESSURE(79),
    MAXVAL_AIRFLOW_RATE(80),
    FUEL_TYPE(81),
    ETHANOL_PERCENTAGE(82),
    ABSOLUTE_EVAP_PRESSURE(83),
    EVAP_PRESSURE(84),
    ST_SECONDARY_SENSOR_B1_B3(85),
    LT_SECONDARY_SENSOR_B1_B3(86),
    ST_SECONDARY_SENSOR_B2_B4(87),
    LT_SECONDARY_SENSOR_B2_B4(88),
    FUEL_RAIL_PRESSURE(89),
    RELATIVE_ACC_PEDAL_POSITION(90),
    HYBRID_BATTLE_REMAINING_LIFE(91),
    ENGINE_OIL_TEMPERATURE(92),
    FUEL_INJECTION_TIMING(93),
    ENGINE_FUEL_RATE(94),
    EMISSION_REQUIREMENTS(95),
    PIDS_SUPPORTED_61_80(96),
    DRIVER_DEMAND_PERCENT_TORQUE(97),
    ACTUAL_ENGINE_PERCENT_TORQUE(98),
    ENGINE_REFERENCE_TORQUE(99),
    ENGINE_PERCENT_TORQUE_DATA(100),
    AUX_IN_OUT_SUPPORTED(101);

    private int extendedTOD;

    private static Map<Integer, ExtendedTOD> map = new HashMap<Integer, ExtendedTOD>();

    static {
        for (ExtendedTOD legEnum : ExtendedTOD.values()) {
            map.put(legEnum.extendedTOD, legEnum);
        }
    }

    private ExtendedTOD(final int leg) { extendedTOD = leg; }

    public static ExtendedTOD valueOf(int ExtendedTOD) {
        return map.get(ExtendedTOD);
    }
}