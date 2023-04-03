package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGMessagePack.*;
import org.sorapointa.proto.GCGMessagePack;

public class GCGMessagePackNotify {
    public enum DNMFDNBGPOC {
        @Tag(tag=0) None ,
        @Tag(tag=7329) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<GCGMessagePack> msgPackList = new ArrayList<>();
    @Tag(tag=6) public Integer serverSeq = null;
}
