package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGOperation.*;
import org.sorapointa.proto.GCGOperation;

public class GCGOperationData {
    @Tag(tag=2) public Integer controllerId = null;
    @Tag(tag=12) public GCGOperation op = null;
}
