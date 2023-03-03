package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AsterMidCampInfo.*;
import org.sorapointa.proto.AsterMidCampInfo;

public class AsterMidCampInfoNotify {
    @Tag(tag=5) public List<AsterMidCampInfo> campList = new ArrayList<>();
}
