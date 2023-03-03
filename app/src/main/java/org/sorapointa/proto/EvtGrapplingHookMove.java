package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtGrapplingHookMove {
    @Tag(tag=1,isFloat=true) public Float acceleration = null;
    @Tag(tag=2) public List<Integer> animatorStateIdList = new ArrayList<>();
    @Tag(tag=3) public Integer entityId = null;
    @Tag(tag=13) public Boolean needSetIsInAir = null;
    @Tag(tag=12,isFloat=true) public Float speed = null;
    @Tag(tag=8,isFloat=true) public Float maxSpeed = null;
    @Tag(tag=11) public Boolean checkAnimatorStateOnExitOnly = null;
    @Tag(tag=14) public String overrideCollider = null;
    @Tag(tag=10) public Vector targetPos = null;
}
