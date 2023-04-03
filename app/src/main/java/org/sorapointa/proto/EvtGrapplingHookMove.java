package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtGrapplingHookMove {
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=14,isFloat=true) public Float maxSpeed = null;
    @Tag(tag=10,isFloat=true) public Float speed = null;
    @Tag(tag=7) public List<Integer> animatorStateIdList = new ArrayList<>();
    @Tag(tag=12) public String overrideCollider = null;
    @Tag(tag=5,isFloat=true) public Float acceleration = null;
    @Tag(tag=4) public Boolean needSetIsInAir = null;
    @Tag(tag=3) public Vector targetPos = null;
    @Tag(tag=13) public Boolean checkAnimatorStateOnExitOnly = null;
}
