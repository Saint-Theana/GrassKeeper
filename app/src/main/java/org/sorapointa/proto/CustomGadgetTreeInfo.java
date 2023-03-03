package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomCommonNodeInfo.*;
import org.sorapointa.proto.CustomCommonNodeInfo;

public class CustomGadgetTreeInfo {
    @Tag(tag=1) public List<CustomCommonNodeInfo> nodeList = new ArrayList<>();
}
