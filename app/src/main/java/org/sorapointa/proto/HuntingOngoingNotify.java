package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HuntingOngoingNotify {
    @Tag(tag=15) public HuntingPair huntingPair = null;
    @Tag(tag=8) public Boolean isStarted = null;
    @Tag(tag=3) public Vector nextPosition = null;
    @Tag(tag=10) public Integer finishClueCount = null;
    @Tag(tag=14) public Boolean isFinal = null;
    @Tag(tag=7) public Integer failTime = null;
}
