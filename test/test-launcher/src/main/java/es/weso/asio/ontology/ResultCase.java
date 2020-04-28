package es.weso.asio.ontology;

public class ResultCase {

	private String node;
	private String shape;
	private String status;

	public ResultCase(String node, String shape, String status) {
		this.node = node;
		this.shape = shape;
		this.status = status;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ResultCase [node=" + node + ", shape=" + shape + ", status=" + status + "]";
	}

	public boolean compareNode(ResultCase r) {
		return this.getNode().equals(r.getNode());
	}

	@Override
	public boolean equals(Object r) {
		if ((this.getShape().equals(((ResultCase) r).getShape()))
				&& (this.getStatus().equals(((ResultCase) r).getStatus()))) {

			return true;
		}

		return false;
	}

}
