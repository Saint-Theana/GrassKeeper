package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetCodexPushtipsReadRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer typeId = null;
    @Tag(tag=14) public Integer codexId = null;
}
