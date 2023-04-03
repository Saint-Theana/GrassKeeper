package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtFixedRushMove {
    @Tag(tag=14) public List<Integer> animatorStateIdList = new ArrayList<>();
    @Tag(tag=9) public Boolean checkAnimatorStateOnExitOnly = null;
    @Tag(tag=11,isFloat=true) public Float speed = null;
    @Tag(tag=13) public String overrideCollider = null;
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=15) public Boolean needSetIsInAir = null;
    @Tag(tag=7) public Vector targetPos = null;
}
