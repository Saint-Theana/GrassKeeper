package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusRenameReq {
    @Tag(tag=1) public Integer nameId = null;
    @Tag(tag=11) public Integer fungusId = null;
}
