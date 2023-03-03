package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGOperation.*;
import org.sorapointa.proto.GCGOperation;

public class GCGOperationReq {
    @Tag(tag=2) public Integer opSeq = null;
    @Tag(tag=7) public Integer redirectUid = null;
    @Tag(tag=15) public GCGOperation op = null;
}
