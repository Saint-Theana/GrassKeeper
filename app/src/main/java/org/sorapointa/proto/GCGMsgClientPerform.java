package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGClientPerformType.*;
import org.sorapointa.proto.GCGClientPerformType;

public class GCGMsgClientPerform {
    @Tag(tag=2) public Integer performType = null;
    @Tag(tag=5) public List<Integer> paramList = new ArrayList<>();
}
