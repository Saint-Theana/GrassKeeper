package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HomePlantFieldStatus {
        @Tag(tag=0) HOME_PLANT_FIELD_STATUS_STATUE_NONE ,
        @Tag(tag=1) HOME_PLANT_FIELD_STATUS_STATUE_SEED ,
        @Tag(tag=2) HOME_PLANT_FIELD_STATUS_STATUE_SPROUT ,
        @Tag(tag=3) HOME_PLANT_FIELD_STATUS_STATUE_GATHER ;
}
