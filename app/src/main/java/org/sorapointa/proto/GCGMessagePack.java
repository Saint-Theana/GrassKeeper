package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGMessage.*;
import org.sorapointa.proto.GCGMessage;

public class GCGMessagePack {
    @Tag(tag=10) public Integer msgSeq = null;
    @Tag(tag=13) public List<GCGMessage> msgList = new ArrayList<>();
}
