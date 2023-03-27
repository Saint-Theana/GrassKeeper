package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtBeingHitInfo {
    @Tag(tag=5) public AttackResult attackResult = null;
    @Tag(tag=7) public Integer peerId = null;
    @Tag(tag=10) public Integer frameNum = null;
}
