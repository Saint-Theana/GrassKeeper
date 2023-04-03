package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtLightCoreMove {
    @Tag(tag=5) public Integer entityId = null;
    @Tag(tag=2,isFloat=true) public Float acelerate = null;
    @Tag(tag=14,isFloat=true) public Float maxAbsorbTime = null;
    @Tag(tag=12) public Vector targetPos = null;
    @Tag(tag=6,isFloat=true) public Float speed = null;
}
