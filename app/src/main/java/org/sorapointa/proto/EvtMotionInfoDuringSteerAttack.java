package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtMotionInfoDuringSteerAttack {
    @Tag(tag=5) public Vector velocity = null;
    @Tag(tag=10) public Vector faceDir = null;
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=9) public Vector pos = null;
}
