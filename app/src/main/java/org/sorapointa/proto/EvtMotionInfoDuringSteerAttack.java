package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtMotionInfoDuringSteerAttack {
    @Tag(tag=4) public Vector faceDir = null;
    @Tag(tag=3) public Vector velocity = null;
    @Tag(tag=1) public Vector pos = null;
    @Tag(tag=6) public Integer entityId = null;
}
