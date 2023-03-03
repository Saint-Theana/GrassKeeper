package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityInfo.*;
import org.sorapointa.proto.OpActivityInfo;

public class OpActivityDataNotify {
    @Tag(tag=15) public List<OpActivityInfo> opActivityInfoList = new ArrayList<>();
}
