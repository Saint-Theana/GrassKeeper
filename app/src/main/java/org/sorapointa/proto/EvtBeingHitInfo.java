package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AttackResult.*;
import org.sorapointa.proto.AttackResult;

public class EvtBeingHitInfo {
    @Tag(tag=6) public Integer peerId = null;
    @Tag(tag=7) public AttackResult attackResult = null;
    @Tag(tag=4) public Integer frameNum = null;
}
