package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;

public class DropItemRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Long guid = null;
    @Tag(tag=15) public Integer storeType = null;
}
