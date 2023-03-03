package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HuntingStartNotify {
    @Tag(tag=4) public Vector cluePosition = null;
    @Tag(tag=15) public Integer failTime = null;
    @Tag(tag=3) public HuntingPair huntingPair = null;
    @Tag(tag=8) public Boolean isFinal = null;
}
