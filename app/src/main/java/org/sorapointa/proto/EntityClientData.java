package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityClientData {
    @Tag(tag=1) public Integer windChangeSceneTime = null;
    @Tag(tag=2,isFloat=true) public Float windmillSyncAngle = null;
    @Tag(tag=3,isSigned=true) public Integer windChangeTargetLevel = null;
}
