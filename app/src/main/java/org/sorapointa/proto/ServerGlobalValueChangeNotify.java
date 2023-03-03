package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerGlobalValueChangeNotify {
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=12,isFloat=true) public Float value = null;
    @Tag(tag=13) public Integer keyHash = null;
}
