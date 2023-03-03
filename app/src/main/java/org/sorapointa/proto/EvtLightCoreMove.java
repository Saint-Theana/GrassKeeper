package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtLightCoreMove {
    @Tag(tag=15) public Vector targetPos = null;
    @Tag(tag=11,isFloat=true) public Float acelerate = null;
    @Tag(tag=5) public Integer entityId = null;
    @Tag(tag=10,isFloat=true) public Float maxAbsorbTime = null;
    @Tag(tag=14,isFloat=true) public Float speed = null;
}
