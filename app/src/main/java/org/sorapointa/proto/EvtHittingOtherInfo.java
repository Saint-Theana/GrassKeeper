package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtHittingOtherInfo {
    @Tag(tag=13) public AttackResult attackResult = null;
    @Tag(tag=3) public Integer peerId = null;
}
