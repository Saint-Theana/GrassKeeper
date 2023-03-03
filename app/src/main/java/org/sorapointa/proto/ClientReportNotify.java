package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientReportNotify {
    @Tag(tag=1) public String reportType = null;
    @Tag(tag=4) public String reportValue = null;
}
