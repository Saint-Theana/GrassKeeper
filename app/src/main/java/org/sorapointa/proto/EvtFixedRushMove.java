package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtFixedRushMove {
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=3,isFloat=true) public Float speed = null;
    @Tag(tag=7) public Boolean needSetIsInAir = null;
    @Tag(tag=2) public List<Integer> animatorStateIdList = new ArrayList<>();
    @Tag(tag=9) public Vector targetPos = null;
    @Tag(tag=6) public Boolean checkAnimatorStateOnExitOnly = null;
    @Tag(tag=13) public String overrideCollider = null;
}
