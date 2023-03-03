package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGTavernNpcInfo.*;
import org.sorapointa.proto.GCGTavernNpcInfo;

public class GCGTavernNpcInfoNotify {
    @Tag(tag=1) public List<GCGTavernNpcInfo> weekNpcList = new ArrayList<>();
    @Tag(tag=5) public GCGTavernNpcInfo characterNpc = null;
    @Tag(tag=15) public List<GCGTavernNpcInfo> constNpcList = new ArrayList<>();
}
