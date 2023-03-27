package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMessagePack {
    @Tag(tag=12) public Integer controllerId = null;
    @Tag(tag=1) public Integer ijojhencdld = null;
    @Tag(tag=3) public List<GCGMessage> msgList = new ArrayList<>();
    @Tag(tag=8) public Integer actionType = null;
}
