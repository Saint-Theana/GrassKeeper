package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HuntingRevealFinalNotify {
    @Tag(tag=5) public Integer finishedGroupId = null;
    @Tag(tag=11) public HuntingPair huntingPair = null;
    @Tag(tag=2) public Vector finalPosition = null;
}
