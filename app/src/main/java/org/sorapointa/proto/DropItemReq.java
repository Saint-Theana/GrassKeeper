package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DropItemReq {
    @Tag(tag=11) public Vector pos = null;
    @Tag(tag=1) public Integer storeType = null;
    @Tag(tag=2) public Integer count = null;
    @Tag(tag=13) public Long guid = null;
}
