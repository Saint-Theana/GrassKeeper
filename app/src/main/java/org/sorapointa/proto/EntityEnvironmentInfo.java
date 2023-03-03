package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityEnvironmentInfo {
    @Tag(tag=1) public Integer jsonClimateType = null;
    @Tag(tag=2) public Integer climateAreaId = null;
}
